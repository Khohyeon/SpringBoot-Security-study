package shop.mtcoding.securityapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import shop.mtcoding.securityapp.dto.UserRequest;
import shop.mtcoding.securityapp.dto.UserResponse;
import shop.mtcoding.securityapp.core.jwt.MyJwtProvider;
import shop.mtcoding.securityapp.model.User;
import shop.mtcoding.securityapp.model.UserRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    /**
     * 1. 트랜잭션 관리
     * 2. 영속성 객체 뱐경감지
     * 3. RequestDTO 요청받기
     * 4. 비지니스 로직 처리하기
     * 5. ResponseDTO 응답하기
     */

    @Transactional  // AOP의 횡단 관심사
    public UserResponse.JoinDto 회원가입(UserRequest.JoinDTO joinDto) {
        String rawPassword = joinDto.getPassword();
        String encPassword = passwordEncoder.encode(rawPassword); // 60Byte
        joinDto.setPassword(encPassword);
        User userPS = userRepository.save(joinDto.toEntity());
        return new UserResponse.JoinDto(userPS);
    }

    @Transactional
    public String 로그인(UserRequest.LoginDTO loginDto) {
        Optional<User> userOP = userRepository.findByUsername(loginDto.getUsername());
        User userPS = userOP.get();
        if (userOP.isPresent()) {
            if (passwordEncoder.matches(loginDto.getPassword(), userPS.getPassword())) {
                String jwt = MyJwtProvider.create(userPS);
                return jwt;
            }
            throw new RuntimeException("패스워드 틀렸어");
        }
        throw new RuntimeException("유저네임이 없어");
    }
}

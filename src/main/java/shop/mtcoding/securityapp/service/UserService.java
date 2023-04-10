package shop.mtcoding.securityapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import shop.mtcoding.securityapp.dto.UserRequest;
import shop.mtcoding.securityapp.model.User;
import shop.mtcoding.securityapp.model.UserRepository;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public User 회원가입(UserRequest.JoinDto joinDto) {
        String rawPassword = joinDto.getPassword();
        String encPassword = passwordEncoder.encode(rawPassword); // 60Byte
        joinDto.setPassword(encPassword);
        return userRepository.save(joinDto.toEntity());
    }
}

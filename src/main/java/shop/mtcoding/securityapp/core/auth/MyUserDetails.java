package shop.mtcoding.securityapp.core.auth;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import shop.mtcoding.securityapp.model.User;

import java.util.ArrayList;
import java.util.Collection;

@Getter
public class MyUserDetails implements UserDetails {

    private User user;

    public MyUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(()->user.getRole());
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() { // 유효기간 체크 하는 메서드
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {   // 비밀번호를 몇번 틀리면 잠그는 메서드
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {  // 패스워드가 만료 되었는지 확인하는 메서드
        return true;
    }

    @Override
    public boolean isEnabled() {  // 비활성화 상태이면 로그인 못하게 잠그는 메서드
        return user.getStatus();
    }
}

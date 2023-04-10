package shop.mtcoding.securityapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // 1. csrf : 잘못 된 경로로 오는 것을 막는다. postman 접근해야됨 - csr사용 할때
        http.csrf().disable();

        // 2. Form 로그인 설정
        http.formLogin()
                .loginPage("/loginForm")
                .usernameParameter("username")
                .passwordParameter("password")
                .loginProcessingUrl("/login") // POST + X-WWW-Form-urlEncoded
//                .defaultSuccessUrl("/") // ex) 로그인을 했을때 원래 가려던 페이지가 없었던 경우 "/" 로 이동한다
                .successHandler((req, resp, authentication) -> {
                    System.out.println("디버그 : 로그인 완료되었습니다.");
                    resp.sendRedirect("/");
                })  // AuthenticationSuccessHandler 로 부터 implement 받아서 구현 후 null 값에 new class 넣어준다.
                .failureHandler((req, resp, ex) -> {
                    System.out.println("디버그 : 로그인 실패" + ex.getMessage());
                });

        // 3. 인증 권한 필터 설정
        http.authorizeRequests(
                (authorize) -> authorize.antMatchers("/users/**").authenticated()
                        .antMatchers("/admin/**").hasRole("ADMIN")
                        .antMatchers("/manager/**").access("hasRore('ADMIN') or hasRole('MANAGER')")
                        .anyRequest().permitAll()
        ); // users 로 가는 경우는 필터를 거쳐야 한다.
        return http.build();
    }
}

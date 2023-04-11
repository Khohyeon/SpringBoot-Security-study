package shop.mtcoding.securityapp.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import shop.mtcoding.securityapp.core.jwt.JwtAuthorizationFilter;

@Slf4j
@Configuration
public class SecurityConfig {

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();

    }

    @Bean
    AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    // JWT 필터 등록이 필요함
    public class CustomSecurityFilterManager extends AbstractHttpConfigurer<CustomSecurityFilterManager, HttpSecurity> {
        @Override
        public void configure(HttpSecurity builder) throws Exception {
            AuthenticationManager authenticationManager = builder.getSharedObject(AuthenticationManager.class);
            builder.addFilter(new JwtAuthorizationFilter(authenticationManager));
            super.configure(builder);
        }
    }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // 1. csrf 해제
        http.csrf().disable();

        // 2. iframe 거부
        http.headers().frameOptions().disable();

        // 3. cors 재설정
        http.cors().configurationSource(configurationSource());

        // 4. jSessionId 사용 거부
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); // jsessionID 요청을 할때 setCookie에 담는다 (stateful 한것을 없앤다.)

        // 5. form 로그인 해제
        http.formLogin().disable();

        // 6. httpBasic 정책 해제 (BasicAuthenticationFilter 해제)
        http.httpBasic().disable();


        // 7. 더 추가로 필요 한 사항 XSS(lucy 필터) - 이 친구를 사용하면 다 막을 수 있다.

        // 8. Custom Filter 적용 (security filter 교환)
        http.apply(new CustomSecurityFilterManager());

        // 9. http 인증 실패 처리
        http.exceptionHandling().authenticationEntryPoint((request, response, authException) -> {
            // checkpoint - 예외핸들러 처리를 할 수가 없다 왜? dispatcher serlvet 전에 있기 때문에 예외 처리를 못한다.
            log.debug("디버그 : 인증실패 : " + authException.getMessage());
            log.info("인포 : 인증실패 : " + authException.getMessage());
            log.warn("워닝 : 인증실패 : " + authException.getMessage());
            log.error("에러 : 인증실패 : " + authException.getMessage());

            response.setContentType("text/plain; chatset=utf-8");
            response.setStatus(403);
            response.getWriter().println("권한 실패");
        });

        // 10. http 권한 실패 처리
        http.exceptionHandling().accessDeniedHandler((request, response, accessDeniedException) -> {
            // checkpoint - 예외핸들러 처리
            log.debug("디버그 : 권한실패 : " + accessDeniedException.getMessage());
            log.info("인포 : 권한실패 : " + accessDeniedException.getMessage());
            log.warn("워닝 : 권한실패 : " + accessDeniedException.getMessage());
            log.error("에러 : 권한실패 : " + accessDeniedException.getMessage());
        });

        // 11. 인증 권한 필터 설정
        http.authorizeRequests(
                (authorize) -> authorize.antMatchers("/users/**").authenticated()
                        .antMatchers("/admin/**").hasRole("ADMIN")
                        .antMatchers("/manager/**").access("hasRore('ADMIN') or hasRole('MANAGER')")
                        .anyRequest().permitAll()
        ); // users 로 가는 경우는 필터를 거쳐야 한다.
        return http.build();
    }
    public CorsConfigurationSource configurationSource() { // security가 들고 있는 filter에 넣어 줘야한다.
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedHeader("*"); // 모든 HEADER를 허용
        configuration.addAllowedMethod("*"); // GET, POST, PUT, DELETE (Javascript 요청 허용)
        configuration.addAllowedOriginPattern("*"); // 모든 IP 주소 허용 (프론트 앤드 IP만 허용 react)
        configuration.setAllowCredentials(true); // 클라이언트에서 쿠키 요청 허용
        configuration.addExposedHeader("Authorization"); // 옛날에는 디폴트 였다. 지금은 아닙니다.
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}

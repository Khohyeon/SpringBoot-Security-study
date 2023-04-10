package shop.mtcoding.securityapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Table(name = "user_tb")
@Entity // Hibernate가 관리 (영속, 비영속, 준영속)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 오토인클리먼트 전략
    private Long id;
    private String username;
    private String password;
    private String email;
    private String role; // User, Manager, ADMIN
    private Boolean status; //ture, false

    private LocalDateTime createdAt; // LocalDateTime -> Timestamp 로 DB에 insert 된다.
    private LocalDateTime updateAt;

    @PrePersist // insert 할 때 동작
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate // update 할 때 동작
    public void onUpdate() {
        this.updateAt = LocalDateTime.now();
    }

    @Builder
    public User(Long id, String username, String password, String email, String role, Boolean status, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
}

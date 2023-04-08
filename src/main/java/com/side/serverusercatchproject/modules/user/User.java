package com.side.serverusercatchproject.modules.user;

import com.side.serverusercatchproject.util.status.UserStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "USERS")
public class User {
    @Id
    @Comment("고유번호")
    private Integer id;

    @Comment("유저아이디")
    private String username;

    @Comment("비밀번호")
    private String password;

    @Comment("권한")
    private String role;

    @Comment("이메일")
    private String email;

    @Comment("전화번호")
    private String tel;

    @Comment("유저 활성화 상태")
    private UserStatus status;
}

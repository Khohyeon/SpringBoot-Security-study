package com.side.serverusercatchproject.modules.user;

import com.side.serverusercatchproject.util.type.EmailAuthenticationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "USERS_EMAIL_AUTH_LIST")
public class UserEmailAuth {
    @Id
    @Comment("고유번호")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @Comment("유저정보")
    private User user;

    @Enumerated(EnumType.STRING)
    @Comment("인증 타입")
    private EmailAuthenticationType type;

    @Comment("인증 코드")
    private String code;

    @Comment("인증 상태")
    private String status;

    @Comment("인증번호 만료시간")
    private Timestamp validationDate;
}

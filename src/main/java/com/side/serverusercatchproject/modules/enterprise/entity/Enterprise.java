package com.side.serverusercatchproject.modules.enterprise.entity;

import com.side.serverusercatchproject.util.status.EnterpriseStatus;
import com.side.serverusercatchproject.util.type.RoleType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ENTERPRISE_LIST")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;

    @Comment("기업아이디")
    private String username;

    @Comment("기업비밀번호")
    private String password;

    @Enumerated(EnumType.STRING)
    @Comment("권한")
    private RoleType roleType;

    @Comment("기업이메일")
    private String email;

    @Comment("기업전화번호")
    private String tel;

    @Enumerated(EnumType.STRING)
    @Comment("기업 활성화 상태")
    private EnterpriseStatus status;
}
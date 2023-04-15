package com.side.serverusercatchproject.modules.user.request;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.Comment;

public record UserSaveRequest(

        @NotBlank(message = "아이디를 입력해주세요")
        String username,

        @NotBlank(message = "비밀번호를 입력해주세요")
        String password,

        @NotBlank(message = "권한을 입력해주세요")
        String role,

        @NotBlank(message = "이메일을 입력해주세요")
        String email,

        @NotBlank(message = "전화번호를 입력해주세요")
        String tel
) {
}

package com.side.serverusercatchproject.modules.enterprise.request;

import com.side.serverusercatchproject.util.type.RoleType;
import jakarta.validation.constraints.NotBlank;

public record EnterpriseSaveRequest(
        @NotBlank(message = "아이디를 입력해주세요")
        String username,
        
        @NotBlank(message = "비밀번호를 입력해주세요")
        String password,

        @NotBlank(message = "권한을 입력해주세요") // TODO ValueOfEnum ? 비즈니스 로직에서 직접 주입인가 ? User도 ?
        String role,

        @NotBlank(message = "이메일을 입력해주세요")
        String email,

        @NotBlank(message = "전화번호를 입력해주세요")
        String tel
) {
}

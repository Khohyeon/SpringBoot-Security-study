package com.side.serverusercatchproject.modules.category.request;

import jakarta.validation.constraints.NotBlank;

public record CategoryUpdateRequest(
        @NotBlank(message = "카테고리 이름을 입력해주세요")
        String name,

        String status
) {
}

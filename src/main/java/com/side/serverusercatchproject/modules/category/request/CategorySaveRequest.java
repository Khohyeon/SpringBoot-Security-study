package com.side.serverusercatchproject.modules.category.request;

import com.side.serverusercatchproject.modules.category.enums.CategoryStatus;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.Comment;

public record CategorySaveRequest(
        @NotBlank(message = "카테고리 이름을 입력해주세요")
        String name
) {
}

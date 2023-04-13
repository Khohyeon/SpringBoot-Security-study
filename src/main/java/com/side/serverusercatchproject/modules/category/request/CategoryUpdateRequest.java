package com.side.serverusercatchproject.modules.category.request;

import com.side.serverusercatchproject.common.ValueOfEnum;
import com.side.serverusercatchproject.modules.category.enums.CategoryStatus;
import jakarta.validation.constraints.NotBlank;

public record CategoryUpdateRequest(
        @NotBlank(message = "카테고리 이름을 입력해주세요")
        String name,
        
        @ValueOfEnum(enumClass = CategoryStatus.class, message = "카테고리 상태 값이 이상이 있습니다. 확인해주세요.")
        String status
) {
}

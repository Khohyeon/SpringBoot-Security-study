package com.side.serverusercatchproject.modules.enterprise.request;

import com.side.serverusercatchproject.common.ValueOfEnum;
import com.side.serverusercatchproject.modules.category.dto.CategoryDTO;
import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.enterprise.enums.StoreCategoryStatus;
import jakarta.validation.constraints.NotBlank;

public record EnterpriseCategoryUpdateRequest(

        @NotBlank(message = "매장 정보를 입력해주세요")
        EnterpriseStoreInfoDTO store,

        @NotBlank(message = "카테고리를 입력해주세요")
        CategoryDTO category,

        @ValueOfEnum(enumClass = StoreCategoryStatus.class, message = "매장 카테고리 상태 값이 이상이 있습니다. 확인해주세요.")
        String status
) {
}

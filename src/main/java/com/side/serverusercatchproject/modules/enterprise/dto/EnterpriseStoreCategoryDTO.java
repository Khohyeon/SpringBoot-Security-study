package com.side.serverusercatchproject.modules.enterprise.dto;

import com.side.serverusercatchproject.modules.category.dto.CategoryDTO;

public record EnterpriseStoreCategoryDTO(
        Integer id,

        EnterpriseStoreInfoDTO store,

        CategoryDTO category,

        String status
) {
}

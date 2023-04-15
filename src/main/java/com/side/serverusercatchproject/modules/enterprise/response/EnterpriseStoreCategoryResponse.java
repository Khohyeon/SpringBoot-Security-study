package com.side.serverusercatchproject.modules.enterprise.response;

import com.side.serverusercatchproject.modules.category.dto.CategoryDTO;

public record EnterpriseStoreCategoryResponse(
        Integer id,

        EnterpriseStoreInfoResponse store,

        CategoryDTO category,

        String status
) {
}

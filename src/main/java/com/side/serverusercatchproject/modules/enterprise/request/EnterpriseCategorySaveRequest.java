package com.side.serverusercatchproject.modules.enterprise.request;

import com.side.serverusercatchproject.modules.category.dto.CategoryDTO;
import com.side.serverusercatchproject.modules.category.entity.Category;
import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.Comment;

public record EnterpriseCategorySaveRequest(

        @NotBlank(message = "매장 정보를 입력해주세요")
        EnterpriseStoreInfoDTO store,

        @NotBlank(message = "카테고리를 입력해주세요")
        CategoryDTO category
) {
}

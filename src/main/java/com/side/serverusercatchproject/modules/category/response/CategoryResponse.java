package com.side.serverusercatchproject.modules.category.response;

import com.side.serverusercatchproject.modules.category.enums.CategoryStatus;
import org.hibernate.annotations.Comment;

public record CategoryResponse(
        Integer id,

        String name,

        String status
) {
}

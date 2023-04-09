package com.side.serverusercatchproject.modules.category.dto;

import com.side.serverusercatchproject.modules.category.enums.CategoryStatus;
import org.hibernate.annotations.Comment;

public record CategoryDTO(
        Integer id,

        String name,

        String status
) {

}

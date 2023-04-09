package com.side.serverusercatchproject.modules.enterprise.dto;

import com.side.serverusercatchproject.util.status.EnterpriseStatus;
import com.side.serverusercatchproject.util.type.RoleType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.hibernate.annotations.Comment;

public record EnterpriseDTO(
        Integer id,

        String username,

        String password,

        RoleType roleType,

        String email,

        String tel,

        EnterpriseStatus status
) {
}

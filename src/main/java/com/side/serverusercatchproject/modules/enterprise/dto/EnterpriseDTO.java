package com.side.serverusercatchproject.modules.enterprise.dto;

import com.side.serverusercatchproject.modules.enterprise.enums.EnterpriseStatus;
import com.side.serverusercatchproject.util.type.RoleType;

public record EnterpriseDTO(
        Integer id,

        String username,

        String password,

        RoleType role,

        String email,

        String tel,

        EnterpriseStatus status
) {
}

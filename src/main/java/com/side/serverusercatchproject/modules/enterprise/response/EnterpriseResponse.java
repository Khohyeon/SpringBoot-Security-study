package com.side.serverusercatchproject.modules.enterprise.response;

import com.side.serverusercatchproject.modules.enterprise.enums.EnterpriseStatus;
import com.side.serverusercatchproject.util.type.RoleType;

public record EnterpriseResponse(
        Integer id,

        String username,

        String password,

        RoleType role,

        String email,

        String tel,

        EnterpriseStatus status
) {
}

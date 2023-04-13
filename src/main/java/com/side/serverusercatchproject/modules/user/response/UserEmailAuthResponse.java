package com.side.serverusercatchproject.modules.user.response;

import com.side.serverusercatchproject.modules.user.dto.UserDTO;

import java.time.LocalDateTime;

public record UserEmailAuthResponse(
        Integer id,

        UserDTO user,

        String type,

        String code,

        String status,

        LocalDateTime validationDate
) {
}

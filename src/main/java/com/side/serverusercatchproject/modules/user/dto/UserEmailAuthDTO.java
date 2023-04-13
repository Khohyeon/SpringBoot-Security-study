package com.side.serverusercatchproject.modules.user.dto;

import java.time.LocalDateTime;

public record UserEmailAuthDTO(
        Integer id,

        UserDTO user,

        String type,

        String code,

        String status,

        LocalDateTime validationDate
) {
}

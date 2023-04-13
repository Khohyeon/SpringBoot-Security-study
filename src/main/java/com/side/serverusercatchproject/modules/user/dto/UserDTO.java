package com.side.serverusercatchproject.modules.user.dto;

import com.side.serverusercatchproject.modules.user.enums.UserStatus;
import org.hibernate.annotations.Comment;

public record UserDTO(
        Integer id,

        String username,

        String email,

        String tel,

        String status
) {

}

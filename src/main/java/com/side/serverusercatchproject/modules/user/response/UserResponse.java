package com.side.serverusercatchproject.modules.user.response;

public record UserResponse(
        Integer id,

        String username,

        String email,

        String tel,

        String status
) {

}

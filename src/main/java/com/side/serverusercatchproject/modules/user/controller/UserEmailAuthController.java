package com.side.serverusercatchproject.modules.user.controller;

import com.side.serverusercatchproject.modules.user.service.UserEmailAuthService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserEmailAuthController {
    private final UserEmailAuthService userEmailAuthService;

    public UserEmailAuthController(UserEmailAuthService userEmailAuthService) {
        this.userEmailAuthService = userEmailAuthService;
    }
}

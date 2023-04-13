package com.side.serverusercatchproject.modules.user.service;

import com.side.serverusercatchproject.modules.user.repository.UserEmailAuthRepository;
import org.springframework.stereotype.Service;

@Service
public class UserEmailAuthService {
    private final UserEmailAuthRepository userEmailAuthRepository;

    public UserEmailAuthService(UserEmailAuthRepository userEmailAuthRepository) {
        this.userEmailAuthRepository = userEmailAuthRepository;
    }
}

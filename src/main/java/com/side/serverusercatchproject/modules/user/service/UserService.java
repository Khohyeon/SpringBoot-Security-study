package com.side.serverusercatchproject.modules.user.service;

import com.side.serverusercatchproject.modules.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}

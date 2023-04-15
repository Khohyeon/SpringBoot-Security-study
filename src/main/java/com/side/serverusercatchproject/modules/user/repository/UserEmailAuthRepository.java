package com.side.serverusercatchproject.modules.user.repository;

import com.side.serverusercatchproject.modules.user.entity.UserEmailAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEmailAuthRepository extends JpaRepository<UserEmailAuth, Integer> {
}

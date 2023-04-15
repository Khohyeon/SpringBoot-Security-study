package com.side.serverusercatchproject.modules.user.repository;

import com.side.serverusercatchproject.modules.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

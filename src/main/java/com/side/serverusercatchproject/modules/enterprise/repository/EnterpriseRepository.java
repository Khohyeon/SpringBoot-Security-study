package com.side.serverusercatchproject.modules.enterprise.repository;

import com.side.serverusercatchproject.modules.enterprise.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Integer> {
    Optional<Enterprise> findByUsername(String username);
}

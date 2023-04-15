package com.side.serverusercatchproject.modules.magazine.repository;

import com.side.serverusercatchproject.modules.magazine.entity.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagazineRepository extends JpaRepository<Magazine,Integer> {
}

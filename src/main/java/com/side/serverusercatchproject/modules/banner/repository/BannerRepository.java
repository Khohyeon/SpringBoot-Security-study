package com.side.serverusercatchproject.modules.banner.repository;

import com.side.serverusercatchproject.modules.banner.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Integer> {
}

package com.side.serverusercatchproject.modules.banner.service;

import com.side.serverusercatchproject.modules.banner.repository.BannerSortRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BannerSortService {

    private final BannerSortRepository bannerSortRepository;

    public BannerSortService(BannerSortRepository bannerSortRepository) {
        this.bannerSortRepository = bannerSortRepository;
    }
}

package com.side.serverusercatchproject.modules.banner.service;

import com.side.serverusercatchproject.modules.banner.entity.Banner;
import com.side.serverusercatchproject.modules.banner.repository.BannerRepository;
import com.side.serverusercatchproject.modules.banner.request.BannerSaveRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BannerService {

    private final BannerRepository bannerRepository;

    public BannerService(BannerRepository bannerRepository) {
        this.bannerRepository = bannerRepository;
    }

    @Transactional
    public Banner save(BannerSaveRequest request) {

        // FileInfo를 insert 시키고


        return bannerRepository.save(request.toEntity());
    }

}

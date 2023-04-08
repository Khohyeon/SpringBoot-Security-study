package com.side.serverusercatchproject.modules.banner.service;

import com.side.serverusercatchproject.modules.banner.repository.BannerEnterpriseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BannerEnterpriseService {
    private final BannerEnterpriseRepository bannerEnterpriseRepository;
    public BannerEnterpriseService(BannerEnterpriseRepository bannerEnterpriseRepository) {
        this.bannerEnterpriseRepository = bannerEnterpriseRepository;
    }


}

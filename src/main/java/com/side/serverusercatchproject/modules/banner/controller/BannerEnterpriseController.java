package com.side.serverusercatchproject.modules.banner.controller;

import com.side.serverusercatchproject.modules.banner.service.BannerEnterpriseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner-enterprise")
public class BannerEnterpriseController {

    private final BannerEnterpriseService bannerEnterpriseService;

    public BannerEnterpriseController(BannerEnterpriseService bannerEnterpriseService) {
        this.bannerEnterpriseService = bannerEnterpriseService;
    }
}

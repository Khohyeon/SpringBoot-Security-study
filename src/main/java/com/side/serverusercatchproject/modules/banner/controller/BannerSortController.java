package com.side.serverusercatchproject.modules.banner.controller;

import com.side.serverusercatchproject.modules.banner.service.BannerSortService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner-sort")
public class BannerSortController {

    private final BannerSortService bannerSortService;

    public BannerSortController(BannerSortService bannerSortService) {
        this.bannerSortService = bannerSortService;
    }
}

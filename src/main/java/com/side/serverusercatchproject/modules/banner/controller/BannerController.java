package com.side.serverusercatchproject.modules.banner.controller;

import com.side.serverusercatchproject.modules.banner.service.BannerService;
import com.side.serverusercatchproject.modules.category.request.CategorySaveRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
public class BannerController {

    private final BannerService bannerService;

    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }
}

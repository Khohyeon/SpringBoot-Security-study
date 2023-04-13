package com.side.serverusercatchproject.modules.magazine.controller;

import com.side.serverusercatchproject.modules.magazine.service.MagazineService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magazines")
public class MagazineController {
    private final MagazineService magazineService;

    public MagazineController(MagazineService magazineService) {
        this.magazineService = magazineService;
    }
}

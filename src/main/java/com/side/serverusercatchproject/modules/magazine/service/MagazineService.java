package com.side.serverusercatchproject.modules.magazine.service;

import com.side.serverusercatchproject.modules.magazine.repository.MagazineRepository;
import org.springframework.stereotype.Service;

@Service
public class MagazineService {
    private final MagazineRepository magazineRepository;

    public MagazineService(MagazineRepository magazineRepository) {
        this.magazineRepository = magazineRepository;
    }
}

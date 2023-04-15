package com.side.serverusercatchproject.modules.event.service;

import com.side.serverusercatchproject.modules.event.repository.StoreEventRepository;
import org.springframework.stereotype.Service;

@Service
public class StoreEventService {

    private final StoreEventRepository storeEventRepository;

    public StoreEventService(StoreEventRepository storeEventRepository) {
        this.storeEventRepository = storeEventRepository;
    }
}

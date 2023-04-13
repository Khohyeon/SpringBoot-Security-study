package com.side.serverusercatchproject.modules.event.dto;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreMenuDTO;

public record StoreEventDTO(
        Integer id,

        EnterpriseStoreMenuDTO menu,

        String title,

        String status
) {
}

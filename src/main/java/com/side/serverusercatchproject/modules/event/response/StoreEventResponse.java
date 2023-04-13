package com.side.serverusercatchproject.modules.event.response;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreMenuDTO;

public record StoreEventResponse(
        Integer id,

        EnterpriseStoreMenuDTO menu,

        String title,

        String status
) {
}

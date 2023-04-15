package com.side.serverusercatchproject.modules.enterprise.response;

import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;

public record EnterpriseStoreMenuResponse(
        Integer id,

        EnterpriseStoreInfoResponse store,

        String name,

        Integer price,

        FileInfoDTO fileInfo,

        String description,

        String status
) {
}

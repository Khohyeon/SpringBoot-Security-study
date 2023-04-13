package com.side.serverusercatchproject.modules.enterprise.dto;

import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;

public record EnterpriseStoreMenuDTO(
        Integer id,

        EnterpriseStoreInfoDTO store,

        String name,

        Integer price,

        FileInfoDTO fileInfo,

        String description,

        String status
) {
}

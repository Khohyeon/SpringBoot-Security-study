package com.side.serverusercatchproject.modules.magazine.dto;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;

public record MagazineDTO(
        Integer id,

        String title,

        String content,

        FileInfoDTO fileInfo,

        EnterpriseStoreInfoDTO store,

        String status
) {
}

package com.side.serverusercatchproject.modules.magazine.response;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;

public record MagazineResponse(
        Integer id,

        String title,

        String content,

        FileInfoDTO fileInfo,

        EnterpriseStoreInfoDTO store,

        String status
) {
}

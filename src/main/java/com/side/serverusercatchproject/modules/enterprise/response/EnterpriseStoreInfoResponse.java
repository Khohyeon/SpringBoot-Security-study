package com.side.serverusercatchproject.modules.enterprise.response;

import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;

import java.time.LocalDateTime;

public record EnterpriseStoreInfoResponse(
        Integer id,

        EnterpriseResponse enterprise,

        String name,

        String address,

        Integer reservationPrice,

        String reservationTerm,

        LocalDateTime reservationCancelDay,

        Double lat,

        Double lon,

        FileInfoDTO fileInfo,

        String status
) {
}

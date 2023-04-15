package com.side.serverusercatchproject.modules.enterprise.dto;

import java.time.LocalDateTime;

public record EnterpriseStoreCalendarDTO(
        Integer id,

        EnterpriseStoreInfoDTO store,

        String day,

        LocalDateTime startTime,

        LocalDateTime endTime,

        LocalDateTime startBreakTime,

        LocalDateTime endBreakTime,

        Boolean isOpen
) {
}

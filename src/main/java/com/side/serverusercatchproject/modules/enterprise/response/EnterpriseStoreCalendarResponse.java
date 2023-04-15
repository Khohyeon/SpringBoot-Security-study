package com.side.serverusercatchproject.modules.enterprise.response;

import java.time.LocalDateTime;

public record EnterpriseStoreCalendarResponse(
        Integer id,

        EnterpriseStoreInfoResponse store,

        String day,

        LocalDateTime startTime,

        LocalDateTime endTime,

        LocalDateTime startBreakTime,

        LocalDateTime endBreakTime,

        Boolean isOpen
) {
}

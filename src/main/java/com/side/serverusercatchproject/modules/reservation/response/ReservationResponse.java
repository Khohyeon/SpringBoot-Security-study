package com.side.serverusercatchproject.modules.reservation.response;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.user.dto.UserDTO;

public record ReservationResponse(
        Integer id,

        UserDTO user,

        Integer qty,

        EnterpriseStoreInfoDTO store,

        String reservationTerm,

        String reservationCancelDay,

        String pushTime,

        String activeTime,

        Integer reservationPrice,

        String status
) {
}

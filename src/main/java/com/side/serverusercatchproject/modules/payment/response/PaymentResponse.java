package com.side.serverusercatchproject.modules.payment.response;

import com.side.serverusercatchproject.modules.reservation.dto.ReservationDTO;

public record PaymentResponse(
        Integer id,

        ReservationDTO reservation,

        Integer price,

        String time,

        String originDate,

        String type,

        String status
) {
}

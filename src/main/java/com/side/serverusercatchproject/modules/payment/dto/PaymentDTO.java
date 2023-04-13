package com.side.serverusercatchproject.modules.payment.dto;

import com.side.serverusercatchproject.modules.reservation.dto.ReservationDTO;

public record PaymentDTO(
        Integer id,

        ReservationDTO reservation,

        Integer price,

        String time,

        String originDate,

        String type,

        String status
) {
}

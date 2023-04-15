package com.side.serverusercatchproject.modules.payment.request;

import com.side.serverusercatchproject.common.ValueOfEnum;
import com.side.serverusercatchproject.modules.payment.enums.PaymentStatus;
import com.side.serverusercatchproject.modules.reservation.dto.ReservationDTO;
import jakarta.validation.constraints.NotBlank;

public record PaymentUpdateResponse(
        ReservationDTO reservation,

        Integer price,

        String time,

        String originDate,

        String type,
        
        String status
) {
}

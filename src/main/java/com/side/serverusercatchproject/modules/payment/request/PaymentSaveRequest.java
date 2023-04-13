package com.side.serverusercatchproject.modules.payment.request;

import com.side.serverusercatchproject.modules.reservation.dto.ReservationDTO;
import jakarta.validation.constraints.NotBlank;

public record PaymentSaveRequest(

        @NotBlank(message = "예약 정보를 입력해주세요")
        ReservationDTO reservation,

        @NotBlank(message = "예약 선금을 입력해주세요")
        Integer price,

        @NotBlank(message = "예약 시간을 입력해주세요")
        String time,

        @NotBlank(message = "결제 정보를 입력해주세요")
        String originDate,

        @NotBlank(message = "결제 타입을 입력해주세요")
        String type
) {
}

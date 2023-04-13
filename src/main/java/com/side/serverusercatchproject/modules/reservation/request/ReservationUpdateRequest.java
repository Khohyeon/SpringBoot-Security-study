package com.side.serverusercatchproject.modules.reservation.request;

import com.side.serverusercatchproject.common.ValueOfEnum;
import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.magazine.enums.MagazineStatus;
import com.side.serverusercatchproject.modules.reservation.enums.ReservationStatus;
import com.side.serverusercatchproject.modules.user.dto.UserDTO;
import jakarta.validation.constraints.NotBlank;

public record ReservationUpdateRequest(
        @NotBlank(message = "유저 정보를 입력해주세요")
        UserDTO user,

        @NotBlank(message = "예약 인원을 입력해주세요")
        Integer qty,

        @NotBlank(message = "매장 정보를 입력해주세요")
        EnterpriseStoreInfoDTO store,

        @NotBlank(message = "예약 시간을 입력해주세요")
        String reservationTerm,

        @NotBlank(message = "예약 취소 가능 날짜를 입력해주세요")
        String reservationCancelDay,

        @NotBlank(message = "예약 누른 시간을 입력해주세요")
        String pushTime,

        @NotBlank(message = "예약 완료 시간을 입력해주세요")
        String activeTime,

        @NotBlank(message = "예약 선금을 입력해주세요")
        Integer reservationPrice,

        @ValueOfEnum(enumClass = ReservationStatus.class, message = "예약 상태 값에 이상이 있습니다. 확인해주세요")
        String status
) {

}

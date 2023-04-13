package com.side.serverusercatchproject.modules.enterprise.request;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import jakarta.validation.constraints.NotBlank;

public record EnterpriseCalendarUpdateRequest(

        @NotBlank(message = "매장 정보를 입력해주세요")
        EnterpriseStoreInfoDTO store,

        @NotBlank(message = "요일을 입력해주세요")
        String day,

        @NotBlank(message = "영업 시작 시간을 입력해주세요")
        String startTime,

        @NotBlank(message = "영업 마감 시간을 입력해주세요")
        String endTime,

        @NotBlank(message = "브레이크 타임 시작 시간을 입력해주세요")
        String startBreakTime,

        @NotBlank(message = "브레이크 타임 마감 시간을 입력해주세요")
        String endBreakTime,

        @NotBlank(message = "영업 여부를 선택해주세요")
        Boolean isOpen
) {
}

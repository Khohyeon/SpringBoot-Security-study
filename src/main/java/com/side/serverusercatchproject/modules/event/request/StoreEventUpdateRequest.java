package com.side.serverusercatchproject.modules.event.request;

import com.side.serverusercatchproject.common.ValueOfEnum;
import com.side.serverusercatchproject.modules.banner.enums.BannerStatus;
import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreMenuDTO;
import com.side.serverusercatchproject.modules.event.enums.StoreEventStatus;
import jakarta.validation.constraints.NotBlank;

public record StoreEventUpdateRequest(

        @NotBlank(message = "메뉴 정보를 입력해주세요.")
        EnterpriseStoreMenuDTO menu,

        @NotBlank(message = "이벤트 내용을 입력해주세요.")
        String title,

        @ValueOfEnum(enumClass = StoreEventStatus.class, message = "이벤트 상태 값이 이상이 있습니다. 확인해주세요.")
        String status
) {
}

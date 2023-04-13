package com.side.serverusercatchproject.modules.event.request;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreMenuDTO;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreMenu;
import com.side.serverusercatchproject.modules.event.enums.StoreEventStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.Comment;

public record StoreEventSaveRequest(

        @NotBlank(message = "메뉴 정보를 입력해주세요.")
        EnterpriseStoreMenuDTO menu,

        @NotBlank(message = "이벤트 내용을 입력해주세요.")
        String title

) {
}

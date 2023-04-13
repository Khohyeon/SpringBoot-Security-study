package com.side.serverusercatchproject.modules.enterprise.request;

import com.side.serverusercatchproject.common.ValueOfEnum;
import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.enterprise.enums.MenuStatus;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record EnterpriseMenuUpdateRequest(

        @NotBlank(message = "매장 정보를 입력해주세요")
        EnterpriseStoreInfoDTO store,

        @NotBlank(message = "메뉴 이름을 입력해주세요")
        String name,

        @NotBlank(message = "메뉴 가격을 입력해주세요")
        Integer price,

        @NotBlank(message = "매뉴 사진을 입력해주세요")
        List<MultipartFile> files,

        @NotBlank(message = "매뉴 소개를 입력해주세요")
        String description,

        @ValueOfEnum(enumClass = MenuStatus.class, message = "메뉴 상태 값이 이상이 있습니다. 확인해주세요.")
        String status
) {
}

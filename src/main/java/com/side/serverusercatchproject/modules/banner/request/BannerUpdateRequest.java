package com.side.serverusercatchproject.modules.banner.request;

import com.side.serverusercatchproject.common.ValueOfEnum;
import com.side.serverusercatchproject.modules.banner.enums.BannerStatus;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record BannerUpdateRequest(
        @NotBlank(message = "배너 사진을 올려주세요.")
        List<MultipartFile> files,

        @NotBlank(message = "이벤트 시작 시간을 입력해주세요.")
        String startTime,

        @NotBlank(message = "이벤트 마감 시간을 입력해주세요.")
        String endTime,
        
        @ValueOfEnum(enumClass = BannerStatus.class, message = "배너 상태 값이 이상이 있습니다. 확인해주세요.")
        String status
)
{

}

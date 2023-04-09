package com.side.serverusercatchproject.modules.banner.request;

import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record BannerUpdateRequest(
        @NotBlank(message = "이벤트 사진을 올려주세요.")
        List<MultipartFile> files,

        @NotBlank(message = "이벤트 시작 시간을 입력해주세요.")
        String startTime,

        @NotBlank(message = "이벤트 마감 시간을 입력해주세요.")
        String endTime,

        String status
)
{

}

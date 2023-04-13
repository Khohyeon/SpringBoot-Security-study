package com.side.serverusercatchproject.modules.banner.request;

import com.side.serverusercatchproject.modules.banner.entity.Banner;
import com.side.serverusercatchproject.modules.banner.enums.BannerStatus;
import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import com.side.serverusercatchproject.util.StringToLocalDateTime;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

public record BannerSaveRequest(
        @NotBlank(message = "이벤트 사진을 올려주세요.")
        List<MultipartFile> files,
        @NotBlank(message = "이벤트 시작 시간을 입력해주세요.")
        String startTime,
        @NotBlank(message = "이벤트 마감 시간을 입력해주세요.")
        String endTime
)
{
        public Banner toEntity() {
            return new Banner(null, null, StringToLocalDateTime.parse(startTime), StringToLocalDateTime.parse(endTime), BannerStatus.WAIT);
        }
}

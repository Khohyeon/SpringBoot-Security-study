package com.side.serverusercatchproject.modules.banner.request;

import com.side.serverusercatchproject.modules.banner.entity.Banner;
import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record BannerSortSaveRequest(
        @NotBlank(message = "배너 정보를 입력해주세요.")
        Banner banner,
        @NotBlank(message = "배너 이름을 입력해주세요.")
        String name,
        @NotBlank(message = "배너의 탭 색을 입력해주세요.")
        String color



) {
}

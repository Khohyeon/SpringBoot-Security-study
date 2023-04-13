package com.side.serverusercatchproject.modules.banner.request;

import com.side.serverusercatchproject.modules.banner.dto.BannerDTO;
import com.side.serverusercatchproject.modules.banner.entity.Banner;
import jakarta.validation.constraints.NotBlank;

public record BannerSortUpdateRequest(
        @NotBlank(message = "배너 정보를 입력해주세요.")
        BannerDTO banner,
        @NotBlank(message = "배너 이름을 입력해주세요.")
        String name,
        @NotBlank(message = "배너의 탭 색을 입력해주세요.")
        String color
) {
}

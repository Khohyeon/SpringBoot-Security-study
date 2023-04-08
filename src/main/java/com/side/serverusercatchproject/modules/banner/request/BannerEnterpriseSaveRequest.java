package com.side.serverusercatchproject.modules.banner.request;

import com.side.serverusercatchproject.modules.banner.entity.BannerSort;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record BannerEnterpriseSaveRequest(
        @NotBlank(message = "배너 탭 정보를 입력해주세요.")
        BannerSort bannerSort,
        @NotBlank(message = "매장 정보를 입력해주세요.")
        EnterpriseStoreInfo store



) {
}

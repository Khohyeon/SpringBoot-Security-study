package com.side.serverusercatchproject.modules.banner.request;

import com.side.serverusercatchproject.modules.banner.dto.BannerSortDTO;
import com.side.serverusercatchproject.modules.banner.entity.BannerSort;
import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
import jakarta.validation.constraints.NotBlank;

public record BannerEnterpriseUpdateRequest(
        @NotBlank(message = "배너 탭 정보를 입력해주세요.")
        BannerSortDTO bannerSort,
        @NotBlank(message = "매장 정보를 입력해주세요.")
        EnterpriseStoreInfoDTO store
) {
}

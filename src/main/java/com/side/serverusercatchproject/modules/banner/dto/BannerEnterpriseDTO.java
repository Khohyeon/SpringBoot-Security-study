package com.side.serverusercatchproject.modules.banner.dto;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;

public record BannerEnterpriseDTO(
        Integer id,

        BannerSortDTO bannerSort,

        EnterpriseStoreInfoDTO store
) {
}

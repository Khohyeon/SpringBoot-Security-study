package com.side.serverusercatchproject.modules.banner.response;

import com.side.serverusercatchproject.modules.banner.entity.BannerSort;
import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Comment;

public record BannerEnterpriseResponse(
        Integer id,

        BannerSort bannerSort,

        EnterpriseStoreInfoDTO store
) {
}

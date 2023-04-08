package com.side.serverusercatchproject.modules.banner.response;

import com.side.serverusercatchproject.modules.banner.dto.BannerDTO;
import com.side.serverusercatchproject.modules.banner.entity.Banner;
import com.side.serverusercatchproject.modules.banner.entity.BannerSort;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Comment;

public record BannerSortResponse(
        Integer id,
        BannerDTO banner,

        String name,
        String color

)
{
}

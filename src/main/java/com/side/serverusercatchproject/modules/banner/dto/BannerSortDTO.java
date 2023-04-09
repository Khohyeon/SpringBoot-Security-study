package com.side.serverusercatchproject.modules.banner.dto;

public record BannerSortDTO(
        Integer id,

        BannerDTO banner,

        String name,

        String color
) {
}

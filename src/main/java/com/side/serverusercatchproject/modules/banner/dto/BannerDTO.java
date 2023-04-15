package com.side.serverusercatchproject.modules.banner.dto;

import com.side.serverusercatchproject.modules.banner.entity.Banner;
import com.side.serverusercatchproject.modules.banner.enums.BannerStatus;
import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;
import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import com.side.serverusercatchproject.util.StringToLocalDateTime;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

public record BannerDTO(
        Integer id,

        FileInfoDTO fileInfo,

        String startTime,

        String endTime,

        String status
) {

}

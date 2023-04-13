package com.side.serverusercatchproject.modules.file.dto;

import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Comment;

public record FileDTO(
        Integer id,

        FileInfoDTO fileInfo,

        String fileName,

        String fileUrl,

        String status
) {
}

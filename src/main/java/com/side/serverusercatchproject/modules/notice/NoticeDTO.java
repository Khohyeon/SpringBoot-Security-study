package com.side.serverusercatchproject.modules.notice;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.hibernate.annotations.Comment;

public record NoticeDTO(

        Integer id,
        String title,
        String content,
        String status

) {
}

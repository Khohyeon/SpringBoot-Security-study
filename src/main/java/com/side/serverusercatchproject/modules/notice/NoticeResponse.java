package com.side.serverusercatchproject.modules.notice;

public record NoticeResponse(
        Integer id,
        String title,
        String content,
        String status
) {
}

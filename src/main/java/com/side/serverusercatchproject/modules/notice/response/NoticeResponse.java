package com.side.serverusercatchproject.modules.notice.response;

public record NoticeResponse(
        Integer id,
        String title,
        String content,
        String status
) {
}

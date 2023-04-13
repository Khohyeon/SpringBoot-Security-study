package com.side.serverusercatchproject.modules.notice.request;

import com.side.serverusercatchproject.modules.notice.entity.Notice;
import com.side.serverusercatchproject.modules.notice.enums.NoticeStatus;
import jakarta.validation.constraints.NotBlank;

public record NoticeSaveRequest (
    @NotBlank(message = "공지사항 제목을 입력해주세요.")
    String title,
    @NotBlank(message = "공지사항 내용을 입력해주세요.")
    String content
) {
    public Notice toEntity () {
        return new Notice(null, title, content, NoticeStatus.WAIT);
    }
}

package com.side.serverusercatchproject.modules.notice.request;

import jakarta.validation.constraints.NotBlank;

public record NoticeUpdateRequest(
    @NotBlank(message = "공지사항 제목을 입력해주세요.")
    String title,
    @NotBlank(message = "공지사항 내용을 입력해주세요.")
    String content,
    String status
) {

}

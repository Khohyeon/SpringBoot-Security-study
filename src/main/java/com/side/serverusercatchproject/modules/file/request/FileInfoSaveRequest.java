package com.side.serverusercatchproject.modules.file.request;

import jakarta.validation.constraints.NotBlank;

public record FileInfoSaveRequest(
        @NotBlank(message = "파일 출처를 입력해주세요") // TODO 출처를 Request 에서 ?
        String type
) {
}

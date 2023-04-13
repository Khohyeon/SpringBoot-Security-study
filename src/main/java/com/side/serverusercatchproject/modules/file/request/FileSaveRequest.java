package com.side.serverusercatchproject.modules.file.request;

import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.Comment;

public record FileSaveRequest(
        @NotBlank(message = "파일 출처를 입력해주세요")
        FileInfoDTO fileInfo,

        @NotBlank(message = "파일 이름을 입력해주세요")
        String fileName,

        @NotBlank(message = "파일 경로를 입력해주세요")
        String fileUrl
) {
}

package com.side.serverusercatchproject.modules.magazine.request;

import com.side.serverusercatchproject.modules.enterprise.dto.EnterpriseStoreInfoDTO;
import com.side.serverusercatchproject.modules.file.dto.FileInfoDTO;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record MagazineSaveRequest(
        @NotBlank(message = "매거진 제목을 입력해주세요")
        String title,

        @NotBlank(message = "매거진 내용 입력해주세요")
        String content,

        @NotBlank(message = "매거진 사진을 입력해주세요")
        List<MultipartFile> files,

        @NotBlank(message = "매장 정보를 입력해주세요")
        EnterpriseStoreInfoDTO store
) {
}

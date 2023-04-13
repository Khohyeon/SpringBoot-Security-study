package com.side.serverusercatchproject.modules.file.service;

import com.side.serverusercatchproject.modules.file.repository.FileInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class FileInfoService {

    private final FileInfoRepository fileInfoRepository;

    public FileInfoService(FileInfoRepository fileInfoRepository) {
        this.fileInfoRepository = fileInfoRepository;
    }
}

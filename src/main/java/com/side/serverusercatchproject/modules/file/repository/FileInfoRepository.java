package com.side.serverusercatchproject.modules.file.repository;

import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo,Integer> {
}

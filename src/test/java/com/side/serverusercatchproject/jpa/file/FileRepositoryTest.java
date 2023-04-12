package com.side.serverusercatchproject.jpa.file;

import com.side.serverusercatchproject.modules.file.entity.File;
import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import com.side.serverusercatchproject.modules.file.repository.FileRepository;
import com.side.serverusercatchproject.modules.notice.NoticeRepository;
import com.side.serverusercatchproject.util.status.FileStatus;
import com.side.serverusercatchproject.util.type.FileType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@ExtendWith(SpringExtension.class)

public class FileRepositoryTest {

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    public void init(){
        FileInfo fileInfo = setUp1(FileType.Image);
        setUp(fileInfo, "image", "jsadjwnqjkdnjskandjskandjka", FileStatus.WAIT);
    }

    @Test
    @Transactional
    void selectAll() {
        List<File> files = fileRepository.findAll();
        Assertions.assertNotEquals(files.size(), 0);

        File file = files.get(0);
        Assertions.assertEquals(file.getFileName(), "image");
    }

    @Test
    @Transactional
    void selectAndUpdate() {
        var optionalFiles = this.fileRepository.findById(1);

        if(optionalFiles.isPresent()) {
            var result = optionalFiles.get();
            Assertions.assertEquals(result.getFileName(),"image");

            var fileUrl = "jsadjwnqjkdnjskandjskandjka111";
            result.setFileUrl(fileUrl);
            File merge = entityManager.merge(result);

            Assertions.assertEquals(merge.getFileUrl(),"jsadjwnqjkdnjskandjskandjka111");
        } else {
            Assertions.assertNotNull(optionalFiles.get().getFileUrl());
        }
    }

//    @Test
//    @Transactional
//    void insertAndDelete() {
//        FileInfo fileInfo = setUp(FileType.Image);
//        Optional<FileInfo> findNotice = this.fileInfoRepository.findById(fileInfo.getId());
//
//        if(findNotice.isPresent()) {
//            var result = findNotice.get();
//            Assertions.assertEquals(result.getType(), FileType.Image);
//            entityManager.remove(fileInfo);
//            Optional<FileInfo> deleteFileInfo = this.fileInfoRepository.findById(fileInfo.getId());
//            if (deleteFileInfo.isPresent()) {
//                Assertions.assertNull(deleteFileInfo.get());
//            }
//        } else {
//            Assertions.assertNotNull(findNotice.get());
//        }
//    }



    private File setUp(FileInfo fileInfo, String fileName, String fileUrl, FileStatus status) {
        var file = new File();
        file.setFileInfo(fileInfo);
        file.setFileName(fileName);
        file.setFileUrl(fileUrl);
        file.setStatus(status);
        return this.entityManager.persist(file);
    }

    private FileInfo setUp1(FileType fileType) {
        var fileInfo = new FileInfo();
        fileInfo.setType(fileType);
        return this.entityManager.persist(fileInfo);
    }
}

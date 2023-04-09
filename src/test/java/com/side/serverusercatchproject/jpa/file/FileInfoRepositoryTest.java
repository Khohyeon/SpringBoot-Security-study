package com.side.serverusercatchproject.jpa.file;

import com.side.serverusercatchproject.modules.file.entity.File;
import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import com.side.serverusercatchproject.modules.file.repository.FileInfoRepository;
import com.side.serverusercatchproject.modules.file.repository.FileRepository;
import com.side.serverusercatchproject.modules.notice.Notice;
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

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class FileInfoRepositoryTest {

    @Autowired
    private FileInfoRepository fileInfoRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    public void init(){
        setUp(FileType.valueOf("image"));
    }

    @Test
    void selectAll() {
        List<FileInfo> fileInfos = fileInfoRepository.findAll();
        Assertions.assertNotEquals(fileInfos.size(), 0);

        FileInfo fileInfo = fileInfos.get(0);
        Assertions.assertEquals(fileInfo.getType(), "image");
    }


    private FileInfo setUp(FileType fileType) {
        var fileInfo = new FileInfo();
        fileInfo.setType(fileType);
        return this.entityManager.persist(fileInfo);
    }
}
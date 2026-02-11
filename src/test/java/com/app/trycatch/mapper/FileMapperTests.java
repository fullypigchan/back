package com.app.trycatch.mapper;

import com.app.trycatch.common.enumeration.file.FileContentType;
import com.app.trycatch.dto.file.FileDTO;
import com.app.trycatch.mapper.file.FileMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FileMapperTests {
    @Autowired
    private FileMapper fileMapper;

    @Test
    public void testInsert() {
        FileDTO fileDTO = new FileDTO();
        fileDTO.setFileName("테스트");
        fileDTO.setFilePath("테스트");
        fileDTO.setFileOriginalName("테스트");
        fileDTO.setFileSize("테스트");
        fileDTO.setFileContentType(FileContentType.IMAGE);

        fileMapper.insert(fileDTO);
        log.info("{}", fileDTO.getId());
    }
}

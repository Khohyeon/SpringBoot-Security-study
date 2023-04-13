package com.side.serverusercatchproject.modules.file.entity;

import com.side.serverusercatchproject.common.jpa.BaseTime;
import com.side.serverusercatchproject.modules.file.enums.FileType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FILE_INFO_LIST")
public class FileInfo extends BaseTime {
    @Id
    @Comment("고유번호")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Comment("파일 출처")
    private FileType type;
}

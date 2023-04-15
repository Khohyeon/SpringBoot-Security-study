package com.side.serverusercatchproject.modules.banner.entity;

import com.side.serverusercatchproject.common.jpa.BaseTime;
import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import com.side.serverusercatchproject.modules.banner.enums.BannerStatus;
import com.side.serverusercatchproject.util.StringToLocalDateTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BANNERS")
public class Banner extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;

    @Comment("이벤트 사진")
    @OneToOne
    private FileInfo fileInfo;

    @Comment("이벤트 시작 시간")
    private LocalDateTime startTime;

    @Comment("이벤트 마감 시간")
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    @Comment("이벤트 활성화 상태")
    private BannerStatus status;
}

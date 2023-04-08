package com.side.serverusercatchproject.modules.enterprise.entity;

import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import com.side.serverusercatchproject.util.status.StoreStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ENTERPRISE_STORE_INFO_LIST")
public class EnterpriseStoreInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;

    @ManyToOne
    @Comment("기업 정보")
    private Enterprise enterprise;

    @Comment("매장 이름")
    private String name;

    @Comment("매장 주소")
    private String address;

    @Comment("예약 선금")
    private Integer reservationPrice;

    @Comment("예약 간격")
    private String reservationTerm;

    @Comment("예약 취소 가능 날짜")
    private LocalDateTime reservationCancelDay;

    @Comment("위도")
    private Double lat;

    @Comment("경도")
    private Double lon;

    @Comment("매장 사진 정보")
    @OneToOne
    private FileInfo fileInfo;

    @Enumerated(EnumType.STRING)
    @Comment("매장 활성화 상태")
    private StoreStatus status;
}

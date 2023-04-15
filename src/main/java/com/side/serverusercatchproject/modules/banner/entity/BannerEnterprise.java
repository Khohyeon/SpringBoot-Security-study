package com.side.serverusercatchproject.modules.banner.entity;

import com.side.serverusercatchproject.common.jpa.BaseTime;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
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
@Table(name = "BANNER_ENTERPRISE_LIST")
public class BannerEnterprise extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;

    @Comment("배너 탭 정보")
    @ManyToOne
    private BannerSort bannerSort;

    @Comment("매장 정보")
    @ManyToOne
    private EnterpriseStoreInfo store;

}

package com.side.serverusercatchproject.modules.banner.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "BANNER_SORT_LIST")
public class BannerSort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;

    @ManyToOne
    @Comment("배너 정보")
    private Banner banner;

    @Comment("이름")
    private String name;

    @Comment("배너 탭 색")
    private String color;

}

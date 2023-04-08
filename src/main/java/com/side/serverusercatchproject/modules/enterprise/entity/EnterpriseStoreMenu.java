package com.side.serverusercatchproject.modules.enterprise.entity;

import com.side.serverusercatchproject.modules.file.entity.FileInfo;
import com.side.serverusercatchproject.util.status.MenuStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ENTERPRISE_STORE_MENUS_LIST")
public class EnterpriseStoreMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;
    
    @ManyToOne
    @Comment("매장 정보")
    private EnterpriseStoreInfo store;
    
    @Comment("메뉴 이름")
    private String name;

    @Comment("메뉴 가격")
    private Integer price;

    @Comment("매뉴 사진")
    @OneToOne
    private FileInfo fileInfo;

    @Comment("메뉴 설명")
    private String description;

    @Enumerated(EnumType.STRING)
    @Comment("메뉴 활성화 상태")
    private MenuStatus status;
}

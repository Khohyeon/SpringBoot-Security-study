package com.side.serverusercatchproject.jpa.banner;


import com.side.serverusercatchproject.modules.banner.entity.BannerEnterprise;
import com.side.serverusercatchproject.modules.banner.entity.BannerSort;
import com.side.serverusercatchproject.modules.banner.enums.BannerStatus;
import com.side.serverusercatchproject.modules.banner.repository.BannerEnterpriseRepository;
import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class BannerEnterpriseRepositoryTest {

    @Autowired
    private BannerEnterpriseRepository bannerEnterpriseRepository; // 조회 용도로만 사용

    @Autowired
    private TestEntityManager entityManager; // 데이터를 건드는 것은 무조건 이걸로 해야함

    @BeforeEach
    public void init() {
        setUp(null, null);
    }

    private BannerEnterprise setUp(
            BannerSort bannerSort, EnterpriseStoreInfo store) {
        var bannerEnterprise = new BannerEnterprise();
        bannerEnterprise.setBannerSort(bannerSort);
        bannerEnterprise.setStore(store);
        return this.entityManager.persist(bannerEnterprise);
    }
}
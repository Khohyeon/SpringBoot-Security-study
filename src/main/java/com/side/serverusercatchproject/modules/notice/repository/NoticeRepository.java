package com.side.serverusercatchproject.modules.notice.repository;

import com.side.serverusercatchproject.modules.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {
}

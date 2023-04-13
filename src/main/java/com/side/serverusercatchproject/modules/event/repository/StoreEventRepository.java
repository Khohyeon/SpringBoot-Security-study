package com.side.serverusercatchproject.modules.event.repository;

import com.side.serverusercatchproject.modules.event.entity.StoreEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreEventRepository extends JpaRepository<StoreEvent, Integer> {

}

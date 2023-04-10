package com.side.serverusercatchproject.modules.reservation.repository;

import com.side.serverusercatchproject.modules.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}

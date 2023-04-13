package com.side.serverusercatchproject.modules.payment.repository;

import com.side.serverusercatchproject.modules.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}

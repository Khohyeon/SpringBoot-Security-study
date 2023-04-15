package com.side.serverusercatchproject.modules.payment.entity;

import com.side.serverusercatchproject.common.jpa.BaseTime;
import com.side.serverusercatchproject.modules.reservation.entity.Reservation;
import com.side.serverusercatchproject.modules.payment.enums.PaymentStatus;
import com.side.serverusercatchproject.modules.payment.enums.PaymentType;
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
@Table(name = "PAYMENTS")
public class Payment extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;

    @Comment("예약 정보")
    @ManyToOne
    private Reservation reservation;

    @Comment("결제 금액")
    private Integer price;

    @Comment("결제 시간")
    private LocalDateTime time;

    @Lob
    @Comment("결제 정보 받는 데이터")
    private String originDate;

    @Enumerated(EnumType.STRING)
    @Comment("결제 타입")
    private PaymentType type;

    @Enumerated(EnumType.STRING)
    @Comment("결제 상태")
    private PaymentStatus status;
}
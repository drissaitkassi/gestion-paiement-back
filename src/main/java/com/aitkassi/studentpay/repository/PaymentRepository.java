package com.aitkassi.studentpay.repository;

import com.aitkassi.studentpay.enums.PaymentStatus;
import com.aitkassi.studentpay.enums.PaymentType;
import com.aitkassi.studentpay.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByStudentCode(String code);

    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);

}

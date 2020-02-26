package com.mes.springstatemachine.repository;

import com.mes.springstatemachine.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mesar on 2/26/2020
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
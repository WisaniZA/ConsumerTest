package com.consumer.consumer.repositories;

import com.consumer.consumer.entities.Withdrawal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WithdrawalRepository extends JpaRepository<Withdrawal, Long> {
}

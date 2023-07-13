package com.consumer.consumer.repositories;

import com.consumer.consumer.entities.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InvestorRepository extends JpaRepository<Investor, UUID> {

}

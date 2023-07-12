package com.consumer.consumer.services.interfaces;

import com.consumer.consumer.entities.Investor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public interface InvestorService {
    List<Investor> getAllInvestor();
    Investor createInvestor(Investor investor);

    boolean isInvestorAgeGreaterThan65(LocalDateTime dateOfBirth);
    Investor getInvestorById(UUID investorId);

}

package com.consumer.consumer.services.implementation;

import com.consumer.consumer.services.interfaces.InvestorService;
import com.consumer.consumer.entities.Investor;
import com.consumer.consumer.repositories.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class InvestorServiceImpl implements InvestorService {
    private final InvestorRepository investorRepository;

    @Autowired
    public InvestorServiceImpl(InvestorRepository investorRepository) {
        this.investorRepository = investorRepository;
    }

    /**
     * @return
     */
    @Override
    public List<Investor> getAllInvestor() {
        return investorRepository.findAll();
    }

    /**
     * @param investor
     * @return
     */
    @Override
    public Investor createInvestor(Investor investor) {
        return investorRepository.save(investor);
    }

    /**
     * @param dateOfBirth
     * @return
     */
    @Override
    public boolean isInvestorAgeGreaterThan65(LocalDateTime dateOfBirth) {
        LocalDateTime now = LocalDateTime.now();
        return now.getYear() - dateOfBirth.getYear() > 65;
    }


    /**
     * @param investorId
     * @return
     */
    @Override
    public Investor getInvestorById(UUID investorId) {
        return investorRepository.findById(investorId).orElse(null);
    }
}

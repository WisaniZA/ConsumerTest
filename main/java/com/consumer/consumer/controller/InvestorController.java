package com.consumer.consumer.controller;

import com.consumer.consumer.entities.Investor;
import com.consumer.consumer.services.interfaces.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * RestController for Investor
 * @author Wisani
 * @version 1.0
 * @since 12/07/23
 */
@RestController
@RequestMapping("/investors")
@CrossOrigin
public class InvestorController {
    private final InvestorService investorService;

@Autowired
    public InvestorController(InvestorService investorService) {
        this.investorService = investorService;
    }

    /**
     * getAllInvestor
     * @return List<Investor>
     */

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Investor> getAllInvestor() {
        return investorService.getAllInvestor();
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Investor createInvestor(Investor investor) {
        return investorService.createInvestor(investor);
    }
  @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInvestorAgeGreaterThan65(LocalDateTime dateOfBirth) {
        LocalDateTime now = LocalDateTime.now();
        return now.getYear() - dateOfBirth.getYear() > 65;
    }

}

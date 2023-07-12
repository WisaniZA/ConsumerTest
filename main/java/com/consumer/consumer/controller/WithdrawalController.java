package com.consumer.consumer.controller;

import com.consumer.consumer.entities.Withdrawal;
import com.consumer.consumer.services.interfaces.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/withdrawals")
@CrossOrigin
public class WithdrawalController {
    private final WithdrawalService withdrawalService;
    @Autowired
    public WithdrawalController(final WithdrawalService withdrawalService) {
        this.withdrawalService = withdrawalService;
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Withdrawal updateWithdrawal(@PathVariable UUID withdrawalId, final Withdrawal withdrawal) {
        return withdrawalService.updateWithdrawal(withdrawal);
    }
}

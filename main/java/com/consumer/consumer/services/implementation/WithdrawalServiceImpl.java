package com.consumer.consumer.services.implementation;

import com.consumer.consumer.entities.Withdrawal;
import com.consumer.consumer.repositories.WithdrawalRepository;
import com.consumer.consumer.services.interfaces.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class WithdrawalServiceImpl implements WithdrawalService {
    private final WithdrawalRepository withdrawalRepository;

    @Autowired
    public WithdrawalServiceImpl(WithdrawalRepository withdrawalRepository) {
        this.withdrawalRepository = withdrawalRepository;
    }

    /**
     * @param withdrawal
     * @return
     */
    @Override
    public Withdrawal updateWithdrawal(Withdrawal withdrawal) {
        Withdrawal existingWithdrawal = withdrawalRepository.findById(withdrawal.getId()).orElse(null);
        existingWithdrawal.setAmount(withdrawal.getAmount());
        existingWithdrawal.setDate(withdrawal.getDate());
        existingWithdrawal.setDescription(withdrawal.getDescription());
        existingWithdrawal.setProduct(withdrawal.getProduct());
        return withdrawalRepository.save(existingWithdrawal);

    }
}

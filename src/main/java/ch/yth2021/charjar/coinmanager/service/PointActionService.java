package ch.yth2021.charjar.coinmanager.service;

import ch.yth2021.charjar.coinmanager.entity.Balance;
import ch.yth2021.charjar.coinmanager.entity.BalanceAction;
import ch.yth2021.charjar.coinmanager.repository.BalanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PointActionService {
    private BalanceRepository balanceRepository;

    public List<Balance> getBalances() {
        balanceRepository.save(Balance.builder().balance(2).userId("mock").build());
        return balanceRepository.findAll();
    }

    public Balance changeBalance(String userId, BalanceAction action) {
        return null;
    }

    public Balance getBalance(String userId) {
        return balanceRepository.findByUserId(userId);
    }
}

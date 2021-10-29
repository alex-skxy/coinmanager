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
        return balanceRepository.findAll();
    }

    public Balance changeBalance(String userId, BalanceAction action) {
        var balance = balanceRepository.findByUserId(userId);
        switch (action.getAction()) {
            case ADD:
                balance.setBalance(balance.getBalance() + action.getAmount());
                break;
            case SUBTRACT:
                balance.setBalance(balance.getBalance() - action.getAmount());
                break;
        }
        return balanceRepository.save(balance);
    }

    public Balance getBalance(String userId) {
        return balanceRepository.findByUserId(userId);
    }
}

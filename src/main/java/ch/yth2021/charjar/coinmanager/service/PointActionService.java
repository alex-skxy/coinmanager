package ch.yth2021.charjar.coinmanager.service;

import ch.yth2021.charjar.coinmanager.entity.Balance;
import ch.yth2021.charjar.coinmanager.entity.BalanceAction;
import ch.yth2021.charjar.coinmanager.repository.BalanceRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@AllArgsConstructor
public class PointActionService {
    private BalanceRepository balanceRepository;

    public Flux<Balance> getBalances() {
        return balanceRepository.findAll();
    }

    public Mono<Balance> changeBalance(String userId, BalanceAction action) {

        return balanceRepository.findByUserId(userId).defaultIfEmpty(Balance.builder().userId(userId).balance(0).build()).map(b -> {
            switch (action.getAction()) {
                case ADD:
                    b.setBalance(b.getBalance() + action.getAmount());
                    break;
                case SUBTRACT:
                    var newBalance = b.getBalance() - action.getAmount();
                    b.setBalance(Math.max(newBalance, 0));
                    break;
            }
            return b;
        }).flatMap(balanceRepository::save);
    }

    public Mono<Balance> getBalance(String userId) {
        return balanceRepository.findByUserId(userId);
    }
}

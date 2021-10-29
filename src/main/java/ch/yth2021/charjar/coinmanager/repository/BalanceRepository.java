package ch.yth2021.charjar.coinmanager.repository;

import ch.yth2021.charjar.coinmanager.entity.Balance;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface BalanceRepository extends ReactiveMongoRepository<Balance, Long> {
    Mono<Balance> findByUserId(String userId);
}

package ch.yth2021.charjar.coinmanager.repository;

import ch.yth2021.charjar.coinmanager.entity.Balance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BalanceRepository extends MongoRepository<Balance, Long> {
    Balance findByUserId(String userId);
}

package ch.yth2021.charjar.coinmanager.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BalanceRepository.class)
public class BalanceRepositoryTest {
    private BalanceRepository balanceRepository;

    @Test
    void createAndGetBalance() {

    }

}

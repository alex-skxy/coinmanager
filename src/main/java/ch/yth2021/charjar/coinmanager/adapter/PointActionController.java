package ch.yth2021.charjar.coinmanager.adapter;

import ch.yth2021.charjar.coinmanager.entity.Balance;
import ch.yth2021.charjar.coinmanager.entity.BalanceAction;
import ch.yth2021.charjar.coinmanager.service.PointActionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(("/users/{userId}/points"))
@AllArgsConstructor
public class PointActionController {
    private PointActionService pointActionService;

    @GetMapping("/debug")
    public Flux<Balance> getBalances(@PathVariable("userId") String userId) {
        return pointActionService.getBalances();
    }


    @GetMapping()
    public Mono<Balance> getBalance(@PathVariable("userId") String userId) {
        return pointActionService.getBalance(userId);
    }

    @PostMapping()
    public Mono<Balance> changeBalance(@PathVariable("userId") String userId, @RequestBody BalanceAction action) {
        return pointActionService.changeBalance(userId, action);
    }
}

package ch.yth2021.charjar.coinmanager.adapter;

import ch.yth2021.charjar.coinmanager.entity.Balance;
import ch.yth2021.charjar.coinmanager.entity.BalanceAction;
import ch.yth2021.charjar.coinmanager.service.PointActionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/users/{userId}/points"))
@AllArgsConstructor
public class PointActionController {
    private PointActionService pointActionService;


    @GetMapping()
    public List<Balance> getBalance(@PathVariable("userId") String userId) {
        return pointActionService.getBalances();
    }

    @PostMapping()
    public Balance changeBalance(@PathVariable("userId") String userId, @RequestBody BalanceAction action) {
        return pointActionService.changeBalance(userId, action);
    }
}
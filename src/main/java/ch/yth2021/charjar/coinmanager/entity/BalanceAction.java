package ch.yth2021.charjar.coinmanager.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BalanceAction {
    private Action action;
    private Integer amount;
}

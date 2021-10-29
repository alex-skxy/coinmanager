package ch.yth2021.charjar.coinmanager.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document("balance")
public class Balance {
    @Id
    private String id;
    private String userId;
    private Integer balance;
}

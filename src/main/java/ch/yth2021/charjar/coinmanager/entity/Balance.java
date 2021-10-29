package ch.yth2021.charjar.coinmanager.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Balance {
    @Id
    private String id;
    @Indexed(unique = true)
    private String userId;
    private Integer balance;
}

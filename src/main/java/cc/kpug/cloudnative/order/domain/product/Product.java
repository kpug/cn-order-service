package cc.kpug.cloudnative.order.domain.product;

import cc.kpug.cloudnative.order.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {

    @Id
    private String productId;

    private String name;

    private Double unitPrice;

    public Product(String name, Double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }
}

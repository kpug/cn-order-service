package cc.kpug.cloudnative.order.domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineItem {
    private String name;
    private String productId;
    private Integer quantity;
    private Double price;
    private Double tax;
}

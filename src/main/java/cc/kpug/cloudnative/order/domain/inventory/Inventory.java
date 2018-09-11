package cc.kpug.cloudnative.order.domain.inventory;

import cc.kpug.cloudnative.order.domain.BaseEntity;
import cc.kpug.cloudnative.order.domain.product.Product;
import cc.kpug.cloudnative.order.domain.warehouse.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory extends BaseEntity {

    @Id
    private String inventoryId;

    private String inventoryNumber;

    private Product product;

    private Warehouse warehouse;

    private InventoryStatus status;

    public Inventory(String inventoryNumber, Product product, Warehouse warehouse,
                     InventoryStatus status) {
        this.inventoryNumber = inventoryNumber;
        this.product = product;
        this.warehouse = warehouse;
        this.status = status;
    }
}

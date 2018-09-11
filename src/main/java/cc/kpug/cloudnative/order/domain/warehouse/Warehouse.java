package cc.kpug.cloudnative.order.domain.warehouse;

import cc.kpug.cloudnative.order.domain.BaseEntity;
import cc.kpug.cloudnative.order.domain.address.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse extends BaseEntity {

    @Id
    private String warehouseId;

    private String name;

    private Address address;

    public Warehouse(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Warehouse(String name) {
        this.name = name;
    }
}

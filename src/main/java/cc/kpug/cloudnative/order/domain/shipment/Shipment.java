package cc.kpug.cloudnative.order.domain.shipment;

import cc.kpug.cloudnative.order.domain.BaseEntity;
import cc.kpug.cloudnative.order.domain.address.Address;
import cc.kpug.cloudnative.order.domain.inventory.Inventory;
import cc.kpug.cloudnative.order.domain.warehouse.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipment extends BaseEntity {
    @Id
    private String shipmentId;

    private Set<Inventory> inventories = new HashSet<>();

    private Address deliveryAddress;

    private Warehouse fromWarehouse;

    private ShipmentStatus shipmentStatus;

    public Shipment(Set<Inventory> inventories, Address deliveryAddress,
                    Warehouse fromWarehouse, ShipmentStatus shipmentStatus) {
        this.inventories = inventories;
        this.deliveryAddress = deliveryAddress;
        this.fromWarehouse = fromWarehouse;
        this.shipmentStatus = shipmentStatus;
    }

}

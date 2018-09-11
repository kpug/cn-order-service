package cc.kpug.cloudnative.order.domain.catalog;

import cc.kpug.cloudnative.order.domain.BaseEntity;
import cc.kpug.cloudnative.order.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catalog extends BaseEntity {

    @Id
    private String catalogId;

    private Set<Product> products = new HashSet<>();

    private String name;

    public Catalog(String name, Collection<Product> products) {
        this.name = name;
        this.products.addAll(products);
    }

    public Catalog(String name) {
        this.name = name;
    }
}

package cc.kpug.cloudnative.order.domain.invoice;

import cc.kpug.cloudnative.order.domain.address.Address;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, String> {

    Invoice findByBillingAddress(Address address);
}

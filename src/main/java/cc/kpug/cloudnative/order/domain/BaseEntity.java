package cc.kpug.cloudnative.order.domain;

import lombok.Data;
import org.joda.time.DateTime;

@Data
public class BaseEntity {
    private DateTime createdAt;

    private DateTime lastModified;
}

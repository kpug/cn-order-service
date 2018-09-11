package cc.kpug.cloudnative.order.domain;

import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BeforeSaveListener extends AbstractMongoEventListener<BaseEntity> {

    @Override
    public void onBeforeSave(BeforeSaveEvent<BaseEntity> event) {
        DateTime timestamp = new DateTime();
        if (Objects.isNull(event.getSource().getCreatedAt())) {
            event.getSource().setCreatedAt(timestamp);
        }

        event.getSource().setLastModified(timestamp);

        super.onBeforeSave(event);
    }
}

package io.bootify.davidtinaut_mongo_biblio.repos;

import io.bootify.davidtinaut_mongo_biblio.domain.Lector;
import io.bootify.davidtinaut_mongo_biblio.service.PrimarySequenceService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class LectorListener extends AbstractMongoEventListener<Lector> {

    private final PrimarySequenceService primarySequenceService;

    public LectorListener(final PrimarySequenceService primarySequenceService) {
        this.primarySequenceService = primarySequenceService;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Lector> event) {
        if (event.getSource().getId() == null) {
            event.getSource().setId(primarySequenceService.getNextValue());
        }
    }

}

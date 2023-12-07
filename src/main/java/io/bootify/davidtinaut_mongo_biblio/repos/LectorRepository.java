package io.bootify.davidtinaut_mongo_biblio.repos;

import io.bootify.davidtinaut_mongo_biblio.domain.Lector;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LectorRepository extends MongoRepository<Lector, Long> {
}

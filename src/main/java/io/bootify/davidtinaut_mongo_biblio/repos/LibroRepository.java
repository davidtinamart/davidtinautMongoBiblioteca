package io.bootify.davidtinaut_mongo_biblio.repos;

import io.bootify.davidtinaut_mongo_biblio.domain.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LibroRepository extends MongoRepository<Libro, Long> {
}

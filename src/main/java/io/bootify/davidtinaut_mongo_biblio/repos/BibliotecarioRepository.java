package io.bootify.davidtinaut_mongo_biblio.repos;

import io.bootify.davidtinaut_mongo_biblio.domain.Bibliotecario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BibliotecarioRepository extends MongoRepository<Bibliotecario, Long> {
}

package cl.codingdojo.asce.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.codingdojo.asce.models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Integer> {

}

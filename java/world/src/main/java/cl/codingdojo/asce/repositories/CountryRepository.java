package cl.codingdojo.asce.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.codingdojo.asce.models.Country;
@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}

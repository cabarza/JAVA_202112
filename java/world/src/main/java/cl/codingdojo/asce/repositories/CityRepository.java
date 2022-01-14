package cl.codingdojo.asce.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.codingdojo.asce.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

}

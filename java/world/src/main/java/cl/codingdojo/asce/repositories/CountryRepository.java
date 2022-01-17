package cl.codingdojo.asce.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import cl.codingdojo.asce.models.Country;
@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Integer> {

}

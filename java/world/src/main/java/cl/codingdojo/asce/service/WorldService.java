package cl.codingdojo.asce.service;

import java.util.List;

import org.springframework.data.domain.Page;

import cl.codingdojo.asce.models.City;
import cl.codingdojo.asce.models.Country;
import cl.codingdojo.asce.models.Language;

public interface WorldService {

	List<Country> findCountries();

	List<City> findCities();

	List<Language> findLanguages();

	Page<Country> findCountriesPage(int page, int pageSize);

}

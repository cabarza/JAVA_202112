package cl.codingdojo.asce.service;

import java.util.List;

import cl.codingdojo.asce.models.City;
import cl.codingdojo.asce.models.Country;
import cl.codingdojo.asce.models.Language;

public interface WorldService {

	List<Country> findCountries();

	List<City> findCities();

	List<Language> findLanguages();

}

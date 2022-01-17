package cl.codingdojo.asce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import cl.codingdojo.asce.models.City;
import cl.codingdojo.asce.models.Country;
import cl.codingdojo.asce.models.Language;
import cl.codingdojo.asce.repositories.CityRepository;
import cl.codingdojo.asce.repositories.CountryRepository;
import cl.codingdojo.asce.repositories.LanguageRepository;
import cl.codingdojo.asce.service.WorldService;

@Service
public class WorldServiceImpl implements WorldService {

	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private LanguageRepository langRepository;
	
	@Override
	public List<Country> findCountries() {
		return (List<Country>) countryRepository.findAll();
	}
	
	@Override
	public Page<Country> findCountriesPage(int page, int pageSize) {
		if(pageSize < 5) {
			pageSize = 5;
		}
		PageRequest pr = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "name"));
		Page<Country> countries = countryRepository.findAll(pr);
		return countries;
	}
	
	@Override
	public List<City> findCities() {
		return (List<City>) cityRepository.findAll();
	}
	
	@Override
	public List<Language> findLanguages() {
		return (List<Language>) langRepository.findAll();
	}
}

package cl.codingdojo.asce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.codingdojo.asce.models.Country;
import cl.codingdojo.asce.repositories.CountryRepository;
import cl.codingdojo.asce.service.WorldService;

@Service
public class WorldServiceImpl implements WorldService {

	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	public List<Country> findCountries() {
		return (List<Country>) countryRepository.findAll();
	}
}

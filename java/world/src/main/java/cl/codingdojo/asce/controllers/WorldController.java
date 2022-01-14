package cl.codingdojo.asce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.codingdojo.asce.models.City;
import cl.codingdojo.asce.models.Country;
import cl.codingdojo.asce.models.Language;
import cl.codingdojo.asce.service.WorldService;

@RestController()
public class WorldController {

	@Autowired
	private WorldService worldService;
	
	@GetMapping(value="countries")
	public List<Country> getCountries() {
		return worldService.findCountries();
	}
	
	@GetMapping(value="cities")
	public List<City> getCities() {
		return worldService.findCities();
	}
	
	@GetMapping(value="langs")
	public List<Language> getLanguages() {
		return worldService.findLanguages();
	}
	
}

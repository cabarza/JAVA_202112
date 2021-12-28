package cl.codingdojo.asce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.codingdojo.asce.models.Persona;
import cl.codingdojo.asce.services.PersonaService;

@RestController
@RequestMapping("personas")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	
	@RequestMapping(path = "", method = {RequestMethod.GET})
	public List<Persona> listar() {
		return this.personaService.listar();
	}
	
	@RequestMapping(path = "", method = {RequestMethod.POST})
	public Persona crear(@RequestBody Persona p) throws Exception {
		return this.personaService.crear(p);
	}
}

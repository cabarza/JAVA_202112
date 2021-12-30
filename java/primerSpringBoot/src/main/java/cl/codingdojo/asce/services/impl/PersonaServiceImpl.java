package cl.codingdojo.asce.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.codingdojo.asce.models.Persona;
import cl.codingdojo.asce.repositories.PersonaRepository;
import cl.codingdojo.asce.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepo;
	
	@Override
	public List<Persona> listar() {
		return (List<Persona>) personaRepo.findAll();
	}
	
	@Override
	public Persona obtenerPorId(long id) {
		Optional<Persona> opt =  personaRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	@Override
	@Transactional
	public Persona crear(Persona persona) throws Exception{
		try {
			Persona p = personaRepo.save(persona);
			return p;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@Override
	@Transactional
	public Persona actualizar(long id, Persona persona) throws Exception {
		try {
			Persona p = this.obtenerPorId(id);
			if(p != null) {
				p.setNombre(persona.getNombre());
				p.setPrimerApellido(persona.getPrimerApellido());
				p.setSegundoApellido(persona.getSegundoApellido());
				p.setEdad(persona.getEdad());
				// Esta línea no es necesaria ya que lo hace igual al terminar el método
				personaRepo.save(p);
				return p;
			} else {
				throw new Exception("La persona no existe");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	
}

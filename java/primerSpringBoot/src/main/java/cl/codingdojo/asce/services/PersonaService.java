package cl.codingdojo.asce.services;

import java.util.List;

import cl.codingdojo.asce.models.Persona;

public interface PersonaService {

	List<Persona> listar();

	Persona obtenerPorId(long id);

	Persona crear(Persona persona) throws Exception;

	Persona actualizar(long id, Persona persona) throws Exception;

}

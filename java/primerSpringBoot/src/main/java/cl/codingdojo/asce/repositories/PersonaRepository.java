package cl.codingdojo.asce.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.codingdojo.asce.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
	
}

package cl.codingdojo.asce.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cl.codingdojo.asce.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
	
	@Query("Select u From User u where u.email = ?1")
	User findByUsername(String username);
}

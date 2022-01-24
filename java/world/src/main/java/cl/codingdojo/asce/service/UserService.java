package cl.codingdojo.asce.service;

import cl.codingdojo.asce.models.User;

public interface UserService {

	User registerUser(User user);

	User findByEmail(String email);

	User findUserById(Long id);

	boolean authenticateUser(String email, String password);

	User findByUsername(String username);

	void saveUserWithAdminRole(User user);

	/*** Uso de registro y login con Spring Security ***/
	void saveWithUserRole(User user);

}

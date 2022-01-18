package cl.codingdojo.asce.service;

import cl.codingdojo.asce.models.User;

public interface UserService {

	User registerUser(User user);

	User findByEmail(String email);

	User findUserById(Long id);

	boolean authenticateUser(String email, String password);

}

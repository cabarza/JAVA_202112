package cl.codingdojo.asce.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.codingdojo.asce.models.User;
import cl.codingdojo.asce.repositories.UserRepository;
import cl.codingdojo.asce.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    @Override
    public User findUserById(Long id) {
    	Optional<User> u = userRepository.findById(id);
    	if(u.isPresent()) {
            return u.get();
    	}
    	return null;
    }
    
    @Override
    public boolean authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return false;
        } else {
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
	
}

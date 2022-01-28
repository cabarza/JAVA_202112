package cl.codingdojo.asce.service.impl;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.codingdojo.asce.models.City;
import cl.codingdojo.asce.models.Role;
import cl.codingdojo.asce.models.User;
import cl.codingdojo.asce.repositories.RoleRepository;
import cl.codingdojo.asce.repositories.UserRepository;
import cl.codingdojo.asce.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
    
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
    
    /** Uso de registro y login sin spring security ***/
    @Override
	@Transactional
	public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
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
    
    
    /*** Uso de registro y login con Spring Security ***/
    @Override
    @Transactional
    public void saveWithUserRole(User user) {
    	String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        List<Role> roles = roleRepository.findByName("ROLE_USER");
        user.setRoles(roles);
        userRepository.save(user);
    }
     
    @Override
    @Transactional
    public void saveUserWithAdminRole(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }    
    
    @Override
    public User findByUsername(String username) {
        return userRepository.findByEmail(username);
    }
	
}

package cl.codingdojo.asce.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cl.codingdojo.asce.models.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "Match");
        }       
		
	}

	

}

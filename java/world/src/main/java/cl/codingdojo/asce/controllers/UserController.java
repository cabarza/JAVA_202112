package cl.codingdojo.asce.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.codingdojo.asce.models.User;
import cl.codingdojo.asce.models.validators.UserValidator;
import cl.codingdojo.asce.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@GetMapping("registro")
	public String registro(@ModelAttribute("user") User user) {
		return "registro.jsp";
	}
	
	@PostMapping("registro")
	public String registrar(@Valid @ModelAttribute("user") User user, BindingResult result) {
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			return "registro.jsp";
		}
		userService.registerUser(user);
		return "redirect:/registro";
	}
	
}

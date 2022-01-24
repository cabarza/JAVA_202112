package cl.codingdojo.asce.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		userService.saveWithUserRole(user);
		return "redirect:/registro";
	}
	
	
	@RequestMapping("/login")
    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Credenciales inválidad, intente nuevamente.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Cierre de sesión exitoso!!!");
        }
        return "login.jsp";
    }
	
	@GetMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        String userName = principal.getName();
        model.addAttribute("userName", userName);
        return "home.jsp";
    }
	
	
	@GetMapping("/403")
	public String error403() {
		System.out.println("Pasa por el error");
		return "error-page.jsp";
	}
	
}

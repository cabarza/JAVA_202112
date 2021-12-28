package cl.codingdojo.asce.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/ejemplo")
public class EjemploPostController {

	@RequestMapping("")
	public String ejemplo(Model model, HttpSession session, 
			@RequestParam(name="nombre", required = false) String nombre) {
//		System.out.println(session.getAttribute("nombre"));
//		model.addAttribute("nombre", session.getAttribute("nombre"));
//		session.removeAttribute("nombre");
		
		model.addAttribute("nombre", nombre);
		
		return "ejemplo.jsp";
	}
	
	@RequestMapping(path = "login", method = RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session
			, RedirectAttributes redirectAtts) {
//		session.setAttribute("nombre", username);
//		session.setAttribute("clave", password);
		
		redirectAtts.addAttribute("nombre", username);
		redirectAtts.addAttribute("password", password);
		
		return "redirect:/ejemplo/";
	}
	
}

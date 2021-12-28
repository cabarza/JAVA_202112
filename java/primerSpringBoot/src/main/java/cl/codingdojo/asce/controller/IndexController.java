package cl.codingdojo.asce.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("cantidad") != null) {
			int cantidad = (int)session.getAttribute("cantidad");
			session.setAttribute("cantidad", cantidad+1);
		} else {
			session.setAttribute("cantidad", 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/test/{nombre}")
	public String indexConNombre(@PathVariable String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String getDate(Model model) {
		model.addAttribute("date", new Date());
		return "index.jsp";
	}
	
	@RequestMapping("/time")
	public String getTime(Model model) {
		model.addAttribute("time", new Date());
		return "index.jsp";
	}
	
	@RequestMapping("/fecha/{tipo}")
	public String getTime(@PathVariable String tipo, Model model, HttpSession session) {
		if(tipo.equals("time")) {
			model.addAttribute("time", new Date());
		} else if(tipo.equals("date")) {
			model.addAttribute("date", new Date());
		} else {
			model.addAttribute("error", "Opción no válida");
			if(session.getAttribute("cantidad") != null) {
				int cantidad = (int)session.getAttribute("cantidad");
				session.setAttribute("cantidad", cantidad+1);
			} else {
				session.setAttribute("cantidad", 1);
			}
		}
		return "index.jsp";
	}
	
	
	
	
}

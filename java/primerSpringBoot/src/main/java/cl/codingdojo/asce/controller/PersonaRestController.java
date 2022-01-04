package cl.codingdojo.asce.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.codingdojo.asce.services.PersonaService;

@RestController
@RequestMapping("personas/ajax/")
public class PersonaRestController {

	@Autowired
	private PersonaService personaService;
	
	
//	@RequestMapping(path = "", method = {RequestMethod.GET})
//	public String listar(Model model) {
//		List<Persona> personas = this.personaService.listar();
//		model.addAttribute("personas", personas);
//		return "/personas/index.jsp";
//		
//	}
//	
//	@RequestMapping(path = "{id}", method = {RequestMethod.GET})
//	public String obtenerPorId(@PathVariable long id, Model model) {
//		Persona p = this.personaService.obtenerPorId(id);
//		model.addAttribute("persona", p);
//		return "/personas/view.jsp";
//	}
//	
//	@RequestMapping(path = "new", method = {RequestMethod.GET})
//	public String crearNueva(@ModelAttribute("persona") Persona p) throws Exception {
//		return "/personas/new.jsp";
//	}
//	
//	@RequestMapping(path = "", method = {RequestMethod.POST})
//	public String crear(@Valid @ModelAttribute("persona") Persona p, BindingResult result) throws Exception {
//		if(result.hasErrors()) {
//			return "/personas/new.jsp";
//		} else {
//			this.personaService.crear(p);
//		}
//		return "redirect:/personas";
//	}
//	
//	
//	@RequestMapping(path = "edit/{id}", method = {RequestMethod.GET})
//	public String editarPersona(@PathVariable long id, Model model) throws Exception {
//		Persona p = this.personaService.obtenerPorId(id);
//		model.addAttribute("persona", p);
//		return "/personas/edit.jsp";
//	}
//	
//	@RequestMapping(path = "{id}", method = {RequestMethod.PUT})
//	public String editar(@Valid @ModelAttribute("persona") Persona p, @PathVariable Long id,  BindingResult result) throws Exception {
//		if(result.hasErrors()) {
//			return "/personas/edit.jsp";
//		} else {
//			this.personaService.actualizar(p.getId(), p);
//		}
//		return "redirect:/personas";
//	}
	
	@RequestMapping(path = "{id}", method = {RequestMethod.DELETE})
	public Map<String, Object> eliminar(@PathVariable Long id) throws Exception {
		this.personaService.eliminar(id);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("eliminado", true);
		return data;
	}
	
}

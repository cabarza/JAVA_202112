package cl.codingdojo.asce.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HomeController {
	
	@RequestMapping(path="mundo", method = {RequestMethod.POST})
	public String hola() {
		return "Hola Mundo!!!";
	}
	
	@RequestMapping("mundo/{nombre}")
	public String hola(@PathVariable String nombre, @RequestParam(name = "d", required = false) String data) {
		return "Hola " + nombre + "!!!, DATA: " + data;
	}
}

package com.primeraConex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MAINController {

	@GetMapping("/") //indicamos la ruta de la web
	public String Index(Model model) {
		
		model.addAttribute("name", "Inicio");
		
		return "Inicio";
	}
	
	@GetMapping("/quienes") //indicamos la ruta de la web
	public String Quienes(Model model) {
		
		model.addAttribute("name", "Quienes");
		
		return "Quienes";
	}
	
	@GetMapping("/que") //indicamos la ruta de la web
	public String Que(Model model) {
		
		model.addAttribute("name", "Que");
		
		return "Que";
	}
	
	@GetMapping("/contacto") //indicamos la ruta de la web
	public String Contacto(Model model) {
		
		model.addAttribute("name", "Contacto");
		
		return "Contacto";
	}
	
}

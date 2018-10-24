package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormularioController {

	@GetMapping("/")
	public String formulario(Model model) {
		
		model.addAttribute("producto", new Producto());
						//nombre del valor	//accede al objeto indicado
		return "formulario";
	}
	
	@PostMapping("/plantillaResultado")
	public String respuestasFormulario(@ModelAttribute Producto product) { //@modelAttribute relaciona el model y usa model.addAttribute
		
		return "plantillaResultado";
	}
	
}

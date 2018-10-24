package com.lbenitez.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lbenitez.spring.clases.Producto;
import com.lbenitez.spring.service.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@GetMapping("/index")
	public String list(Model model) {
		model.addAttribute("productosRegistrados", service.findAll());
		return "index";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		//model.addAttribute();
		return "add";
	}
	
	@GetMapping("/edit")
	public String edit(Model model, Producto p) {
		model.addAttribute("productoEditado", service.findProduct(p));
		return "edit";
	}
	
	@PostMapping("/producto")
	public String respuestasFormulario(@ModelAttribute Producto product) { //@modelAttribute relaciona el model y usa model.addAttribute
		
		return "producto";
	}
	
}

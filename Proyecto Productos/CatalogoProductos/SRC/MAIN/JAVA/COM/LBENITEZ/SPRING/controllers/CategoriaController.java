package com.lbenitez.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lbenitez.spring.service.CategoriaService;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaService cService;
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("productos", cService.findAll());
		return "index";
	}
	
}
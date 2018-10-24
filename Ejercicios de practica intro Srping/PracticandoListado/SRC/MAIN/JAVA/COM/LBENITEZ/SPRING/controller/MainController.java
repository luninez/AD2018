package com.lbenitez.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lbenitez.spring.service.PersonaService;

@Controller
public class MainController {

	@Autowired
	private PersonaService service;
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("personas", service.findAll());
		return "ListaPersona";
	}
	
}

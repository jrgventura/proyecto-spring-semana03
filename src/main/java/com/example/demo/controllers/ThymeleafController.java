package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

	//1.
	@GetMapping("/thymeleaf")
	public String thymeleaf(){
		return "thymeleaf";
	}
	
	//2.
	@GetMapping("/thymeleaf2")
	public String thymeleaf2(Model model){
		model.addAttribute("mensaje", "Hola a todos!!!!");
		return "thymeleaf2";
	}
	
	
	
}

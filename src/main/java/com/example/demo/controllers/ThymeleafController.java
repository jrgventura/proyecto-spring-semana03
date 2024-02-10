package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
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
	
}

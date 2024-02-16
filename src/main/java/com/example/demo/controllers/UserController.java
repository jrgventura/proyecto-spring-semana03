package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	public String getAllUsers(Model model ) {
		
		List<User> listUser = userService.getAllUser();
		
		model.addAttribute("users", listUser);
		
		return "userList";
	}
	
	@GetMapping("/register")
	public String register() {
		return "userRegister";
	}
	
	@PostMapping("/register")
	public String createUSer(@RequestParam("name") String name, 
			@RequestParam("email") String email, Model model) {
		
		User user = new User();
		user.email = email;
		user.name = name;
		
		userService.createUser(user);
		
		List<User> listUser = userService.getAllUser();
		model.addAttribute("users", listUser);
		
		return "userList";
	}
	
	
}







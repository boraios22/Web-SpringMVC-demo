package com.itstep.spring.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itstep.spring.model.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String getLogin() {
		return "Login";
	}
	
	@PostMapping("/login")
	public String handleLogin(User user) {
		return "LoginSuccess";
	}
	
}

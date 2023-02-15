package com.itstep.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class RegisterController {
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {
		return "Hello from test";
	}
	
	@RequestMapping(value = "/greeting")
	public String greeting() {
		return "Greeting";
	}
	
}

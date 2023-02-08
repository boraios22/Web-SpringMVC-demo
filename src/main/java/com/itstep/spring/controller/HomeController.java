package com.itstep.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String sayHello () {
		return "Hello";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String receivedData (
			@RequestParam String name, 
			@RequestParam String password, 
			ModelMap model) {
		
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		
		
		return "Hello";
	}
	
	
	@RequestMapping("/home2")
	@ResponseBody
	public String something() {
		return "something";
	}
	
}

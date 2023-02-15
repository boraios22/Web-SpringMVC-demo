package com.itstep.spring.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestControlller {

	//@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	
	
	@GetMapping(value = "/getUser/{id}")
	public String getUser(@PathVariable("id") String id) {
		return "User A{name, age} : " + id;
	}
	@PostMapping(value = "/posUser")
	public String postUser() {
		return "User A{name, age}";
	}
}

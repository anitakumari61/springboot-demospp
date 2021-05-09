package com.example.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld")
	public String helloWorld() {
		
		return "Hello--World";
	}
	
	@GetMapping("helloWorldBean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Anita", "Choudhary", "Sikar");
	}

}

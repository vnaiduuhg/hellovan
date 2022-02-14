package com.naidu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String helloAwsWorld() {
		return "Welcome to AWS docker world!!!";
	}

}

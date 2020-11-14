package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
	
	@RequestMapping("/greet")
	public String getGreeting() {
		return "HelloDocker";
	}

}
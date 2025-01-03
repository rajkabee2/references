package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${person.name}")
	private String name;

	
	@GetMapping("/name")
	public String name() {
		return name;
	}
}

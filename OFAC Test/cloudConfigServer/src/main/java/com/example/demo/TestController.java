package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${country}")
    private String name;
	
	@GetMapping("/get")
	public String get() {
		return name;
	}
}

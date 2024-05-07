package com.ppes.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

	@Value("${country}")
	private String Country;
	
	@GetMapping(value="/message")
	public String getMessage() {
		return "Welcome to "+ Country;
	}
	
}

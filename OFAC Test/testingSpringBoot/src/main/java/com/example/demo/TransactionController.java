package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

	@Autowired 
	TransactionRepository txnRepo;
	
	@GetMapping("/date")
	public String getMethodName() {
		return txnRepo.getCreatedDate().toLocalDateTime().toString();
	}
	
	
}

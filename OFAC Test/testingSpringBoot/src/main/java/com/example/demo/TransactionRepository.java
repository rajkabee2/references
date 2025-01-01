package com.example.demo;


import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;
@RestResource
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	@Query(value="select created_date FROM transactions order by id desc limit 1", nativeQuery = true)
	public Timestamp getCreatedDate();
	
}

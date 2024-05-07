package com.ppes.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmbeddedConfigServerJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedConfigServerJdbcApplication.class, args);
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EmbedCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbedCloudConfigApplication.class, args);
	}

}

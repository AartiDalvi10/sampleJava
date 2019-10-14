package com.location.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
public class MainApplication{

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	   }
	

	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String getMessage() {
		return "hello GM";
	}
	
	}

	
	


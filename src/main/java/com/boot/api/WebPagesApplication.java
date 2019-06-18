package com.boot.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class WebPagesApplication {

	private static Logger logger=LoggerFactory.getLogger(WebPagesApplication.class);
	
	@PostConstruct
	public void init(){
		logger.info("application intiated");
	}
	
	@GetMapping("/get")
	public String get(){
		return "hi hello";
	}
	
	
	public static void main(String[] args) {
		logger.info("application started");
		SpringApplication.run(WebPagesApplication.class, args);
	}

}

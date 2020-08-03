package com.faseuno.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.faseuno.demo.controller.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ComponentScan(basePackageClasses=RestController.class)
public class DemoApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
			log.info("Avviata prima Microservice Iniziale");
		
		
		
	
	
	}

}

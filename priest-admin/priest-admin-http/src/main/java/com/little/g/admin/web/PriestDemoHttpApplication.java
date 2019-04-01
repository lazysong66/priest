package com.little.g.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class PriestDemoHttpApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriestDemoHttpApplication.class, args);
	}

}
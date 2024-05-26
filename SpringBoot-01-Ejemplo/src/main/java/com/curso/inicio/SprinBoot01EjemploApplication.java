package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.curso.controller")
public class SprinBoot01EjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBoot01EjemploApplication.class, args);
	}

}

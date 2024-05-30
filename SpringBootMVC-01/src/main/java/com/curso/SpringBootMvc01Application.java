package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages= {"com.curso.controller"})
public class SpringBootMvc01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc01Application.class, args);
	}

}

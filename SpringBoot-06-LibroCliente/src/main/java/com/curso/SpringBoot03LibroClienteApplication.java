package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages= {"com.curso.controller","com.curso.service"})
public class SpringBoot03LibroClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot03LibroClienteApplication.class, args);
	}
	
	//Referencia que nos permite comunicar un microservicio o servicio con otro
	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}
}

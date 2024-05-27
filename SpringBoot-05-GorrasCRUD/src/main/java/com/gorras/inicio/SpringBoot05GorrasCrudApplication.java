package com.gorras.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages="com.gorras.model")
@EnableJpaRepositories(basePackages="com.gorras.dao")
@SpringBootApplication(scanBasePackages= {"com.gorras.controller","com.gorras.service"})
public class SpringBoot05GorrasCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot05GorrasCrudApplication.class, args);
	}

}

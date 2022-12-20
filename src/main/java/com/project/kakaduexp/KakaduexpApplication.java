package com.project.kakaduexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan({"main.controllers", "main.service"})
@EnableJpaRepositories("main.repositories")
@ComponentScan({"main.controllers", "main.repositories"})
@SpringBootApplication
public class KakaduexpApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakaduexpApplication.class, args);
	}

}

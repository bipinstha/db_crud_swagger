package com.bipinstha.dbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories
public class DbcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbcrudApplication.class, args);
	}
}

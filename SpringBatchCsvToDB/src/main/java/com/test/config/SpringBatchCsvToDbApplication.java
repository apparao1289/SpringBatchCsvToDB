package com.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.test")
public class SpringBatchCsvToDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchCsvToDbApplication.class, args);
	}
}

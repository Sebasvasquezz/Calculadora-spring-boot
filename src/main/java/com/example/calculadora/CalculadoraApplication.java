package com.example.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main class for the Spring Boot application.
 * It bootstraps the Spring application context.
 */
@SpringBootApplication
public class CalculadoraApplication {

	/**
     * The main method serves as the entry point for the Spring Boot application.
     * It uses Spring Boot’s SpringApplication.run() method to launch the application.
     *
     * @param args command line arguments passed to the application.
     */
	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

}

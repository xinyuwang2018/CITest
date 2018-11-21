package com.cicdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("spring boot running...");
		SpringApplication.run(DemoApplication.class, args);
	}
}
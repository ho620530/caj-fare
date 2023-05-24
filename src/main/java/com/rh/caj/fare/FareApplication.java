package com.rh.caj.fare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class FareApplication {

	public static void main(String[] args) {
		System.out.println("peterho");
		SpringApplication.run(FareApplication.class, args);
	}

}

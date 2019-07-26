package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class PersonMicroServicesProj3Application {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	} 
	public static void main(String[] args) {
		SpringApplication.run(PersonMicroServicesProj3Application.class, args);
	}

}

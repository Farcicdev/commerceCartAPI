package com.ecommerce.CommerceCartAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommerceCartApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommerceCartApiApplication.class, args);
	}

}

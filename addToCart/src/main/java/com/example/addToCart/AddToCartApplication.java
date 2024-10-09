package com.example.addToCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AddToCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddToCartApplication.class, args);
	}

}

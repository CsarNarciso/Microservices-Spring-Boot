package com.cesar.Editorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EditorialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EditorialsApplication.class, args);
	}

}

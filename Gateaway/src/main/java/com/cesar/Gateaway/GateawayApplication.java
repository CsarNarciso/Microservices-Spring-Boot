package com.cesar.Gateaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class GateawayApplication {


    @Bean
    RouteLocator routes(RouteLocatorBuilder builder) {
		
		return builder.routes()
				
				.route( r -> r
						.path("/books/**")
						.uri( "http://msvc-books" ))
				.build();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(GateawayApplication.class, args);
	}

}

package com.example.eurekaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerApplication.class, args);
	}

}


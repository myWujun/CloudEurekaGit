package com.example.hystrixdashboardturbinenode2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HystrixDashboardTurbineNode2Application {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardTurbineNode2Application.class, args);
	}

}


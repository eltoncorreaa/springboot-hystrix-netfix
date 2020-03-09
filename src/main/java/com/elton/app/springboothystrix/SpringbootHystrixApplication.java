package com.elton.app.springboothystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@Configuration
public class SpringbootHystrixApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringbootHystrixApplication.class, args);
	}
}
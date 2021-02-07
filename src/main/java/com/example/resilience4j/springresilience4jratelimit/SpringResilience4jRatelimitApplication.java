package com.example.resilience4j.springresilience4jratelimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.stream.IntStream;

@SpringBootApplication
public class SpringResilience4jRatelimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringResilience4jRatelimitApplication.class, args);
		/*int i=1;
		IntStream.range(i,20).parallel().forEach(t->{
			String response = new RestTemplate().getForObject("http://localhost:8080/order", String.class);

		});*/

	}

}

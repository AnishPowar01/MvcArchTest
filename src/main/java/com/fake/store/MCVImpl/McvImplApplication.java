package com.fake.store.MCVImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class McvImplApplication {

	public static void main(String[] args) {
		System.out.println("Hello Ji Kaise ho");
		SpringApplication.run(McvImplApplication.class, args);
	}

}

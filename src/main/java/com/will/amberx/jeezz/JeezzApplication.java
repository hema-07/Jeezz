package com.will.amberx.jeezz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * enabled repo package explicitly in main class
 */
@EnableJpaRepositories(basePackages = "com.will.amberx.jeezz.repository")
@SpringBootApplication
public class JeezzApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeezzApplication.class, args);
	}

}

package com.Practice.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Practice.Practice")
public class PracticeApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(PracticeApplication.class, args);
	}
}

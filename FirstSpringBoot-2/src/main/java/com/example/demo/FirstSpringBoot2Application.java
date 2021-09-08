package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example.demo.controller","com.example.demo.pojo"})
@SpringBootApplication
public class FirstSpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBoot2Application.class, args);
	}

}

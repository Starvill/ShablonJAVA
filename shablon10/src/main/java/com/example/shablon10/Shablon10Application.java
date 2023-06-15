package com.example.shablon10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Shablon10Application {

	public static void main(String[] args) {

		SpringApplication.run(Shablon10Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		NamePolitian politic = context.getBean(NamePolitian.class);
		politic.walk();
	}

}

package com.example.springdemo;

import com.example.springdemo.model.laptop;
import com.example.springdemo.model.student;
import com.example.springdemo.service.laptopservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringdemoApplication.class, args);
		System.out.println("hello world..");
		laptop lap=context.getBean(laptop.class);

		laptopservice service=context.getBean(laptopservice.class);
		service.addlaptop(lap);


	}

}

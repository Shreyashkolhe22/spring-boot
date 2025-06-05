package com.examplespringjdbc.demospringjdbc;

import com.examplespringjdbc.demospringjdbc.model.student;
import com.examplespringjdbc.demospringjdbc.service.studentservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemospringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemospringjdbcApplication.class, args);

		student s1=context.getBean(student.class);
		s1.setRollno(1);
		s1.setName("akash");
		s1.setMarks(87);

		studentservice service=context.getBean(studentservice.class);
		service.addstudent(s1);

		List <student> students=service.getstudents();
		System.out.println(students);
	}

}

package com.luna.javaoop;

import model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaOopApplication {

	public static void main(String[] args) {
		Student s=new Student("zhangsan",23,'男',"1234");
		SpringApplication.run(JavaOopApplication.class, args);
        System.out.println("student:{"+s.name+","+s.age+","+s.gender+","+s.id+"}");
	}
}

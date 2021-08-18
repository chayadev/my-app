package com.myapp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {
	private final String message = "Hello World";
	public MyAppApplication() {}

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
		System.out.println(new MyAppApplication().getMessage());
	}

	private final String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}

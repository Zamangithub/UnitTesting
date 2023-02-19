package com.UnitTesting.UnitTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(UnitTestApplication.class, args);
	}
	public int sum(int a, int b) {
		return a + b;
	}
}

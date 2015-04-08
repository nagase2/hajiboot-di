package com.example.app;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class App {
	public static void main(String[] args) {

		try (ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		// Scanner scanner = new Scanner(System.in);
		) {

			System.out.println("aaammllmxxx");

			System.out.print("Enter 2 numbers like 'a b'");
			ArgumentResolver aResolver = context.getBean(ArgumentResolver.class);

			Argument argument = aResolver.resolve(System.in);
			// int a = scanner.nextInt();
			// int b = scanner.nextInt();
			Calculator calculator = context.getBean(Calculator.class);

			int result = calculator.calc(argument.getA(), argument.getB());

			System.out.println("Result=" + result);

			// Argument argument = new Argument(3,3);
			// argument.getA();

		}
	}
}

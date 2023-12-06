package com.employees.api;

import com.employees.api.Models.Car;
//import com.employees.api.Models.calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);


		Car car1 = new Car("Toyota", 2001, 50000.0, true);
		Car car2 = new Car("Suzuki", 2023, 90000.0, false);

		String k;

		do {


			double total=0;

			Scanner input = new Scanner(System.in);

			System.out.print("Enter first number- ");
			double firstnumber= input.nextDouble();

			System.out.print("Enter Operator- ");
			String sign= input.next();

			System.out.print("Enter second number- ");
			double secondtnumber= input.nextDouble();


			input.nextLine();

			switch (sign){
				case "+":
					total = firstnumber + secondtnumber;
					break;

				case "-":
					total = firstnumber - secondtnumber;
					break;


				case "/":
					total = firstnumber / secondtnumber;
					break;


				case "*":
					total = firstnumber * secondtnumber;
					break;
			}

			System.out.print("your total is: "+ total);
			System.out.print("Enter any string to continue(or z to cancel) ");
			k= input.nextLine();





		}while (!k.equals("z"));

		System.out.println("End of the Program");

	}
}







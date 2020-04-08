package Calc;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			int choice =sc.nextInt();
			double num1,num2;
			switch(choice) {
			case 1:
				System.out.println("Performing Addition.");
				System.out.println("Enter two numbers: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				Addition.add(num1,num2);
				break;
			case 2:
				System.out.println("Performing Substration");
				System.out.println("Enter two numbers: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				Substration.sub(num1,num2);
				break;
			case 3:
				System.out.println("Performing Multiplication.");
				System.out.println("Enter two numbers: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				Multiplication.mul(num1,num2);
				break;
			case 4:
				System.out.println("Performing Division.");
				System.out.println("Enter two numbers: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				Division.div(num1,num2);
				break;
			case 5:
				System.out.println("Thank You.");
				System.exit(0);
			default:
				System.out.println("Invalid Choice, Try Again!");
			}
		}
	}
}

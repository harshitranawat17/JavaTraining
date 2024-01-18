package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_32_CalculatorUsingSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Simple Calculator----");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		int first, second;
		
		int choose = sc.nextInt();
		
		switch (choose) {
		case 1:
			System.out.println("Enter first number: ");
			first = sc.nextInt();
			System.out.println("Enter second number: ");
			second = sc.nextInt();
			
			System.out.println("Addition is: "+(first+second));
			break;
		case 2:
			System.out.println("Enter first number: ");
			first = sc.nextInt();
			System.out.println("Enter second number: ");
			second = sc.nextInt();
			
			System.out.println("Substraction is: "+(first-second));
			break;
		case 3:
			System.out.println("Enter first number: ");
			first = sc.nextInt();
			System.out.println("Enter second number: ");
			second = sc.nextInt();
			
			System.out.println("Multiplication is: "+(first*second));
			break;
		case 4:
			System.out.println("Enter first number: ");
			first = sc.nextInt();
			System.out.println("Enter second number: ");
			second = sc.nextInt();
			
			System.out.println("Division is: "+(first/second));
			break;
		case 5:
			break;

		default:
			System.out.println("invalid option");
			break;
		}
		sc.close();
	}
}

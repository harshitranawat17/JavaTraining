package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_36_GCDUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int result = gcd(num1, num2);
		System.out.println("GCD is: "+result);
		
		sc.close();
	}
	public static int gcd(int num1, int num2) {
		if(num2 != 0) {
			return gcd(num2, num1 % num2);
		}else {
			return num1;
		}
	}
	
}																					

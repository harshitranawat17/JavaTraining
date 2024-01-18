package JavaPrograms_11to20;

import java.util.Scanner;
public class Problem_15_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numnber: ");
		int num = sc.nextInt();
		
		int fact = factorial(num);
		
		System.out.println("factorial is "+fact);
		sc.close();
	}
	
	public static int factorial(int num) {
		
		if(num >= 1) {
			return num * factorial(num-1);
		}else {
			return 1;
		}
		
	}
}


package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_35_FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int result = fact(num);
		System.out.println("Factorial is: "+result);
		
		sc.close();
	}
	
	public static int fact(int num) {
		if(num >= 1) {
			return num * fact(num-1);
		}else {
			return 1;
		}
	}
	
}

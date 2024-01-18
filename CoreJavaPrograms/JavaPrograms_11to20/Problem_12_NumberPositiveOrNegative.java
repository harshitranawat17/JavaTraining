package JavaPrograms_11to20;

import java.util.Scanner;
public class Problem_12_NumberPositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numnber: ");
		double num = sc.nextDouble();
		
		if(num > 0.0) {
			System.out.println(num+" is positive number");
		}
		else if(num < 0.0) {
			System.out.println(num+" is negative number");
		}
		else {
			System.out.println(num+" is not positive or negative number");
		}
		
		sc.close();
	}
}

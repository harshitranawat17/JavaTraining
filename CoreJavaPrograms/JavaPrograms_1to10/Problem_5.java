package JavaPrograms_1to10;

import java.util.Scanner;
public class Problem_5 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a dividend value: ");
		int dividend = sc.nextInt();
		System.out.print("Enter a diviser value: ");
		int diviser = sc.nextInt();
		
		int quotient = dividend / diviser;
		int remainder = dividend % diviser;

		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder); 
		
		sc.close();
	}
}

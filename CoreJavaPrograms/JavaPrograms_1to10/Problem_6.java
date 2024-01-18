package JavaPrograms_1to10;

import java.util.Scanner;
public class Problem_6 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int value1 = sc.nextInt();
		System.out.print("Enter second value: ");
		int value2 = sc.nextInt();
	
		System.out.println("Before swap: ");
		System.out.println("First number: "+value1);
		System.out.println("Second number: "+value2 );
		
		//swaping
		value1 = value1 - value2;
		value2 = value1 + value2;
		value1 = value2 - value1;
		
		System.out.println("After swap: ");
		System.out.println("First number: "+value1);
		System.out.println("Second number: "+value2 );
		
		sc.close();
		
		
	}
}

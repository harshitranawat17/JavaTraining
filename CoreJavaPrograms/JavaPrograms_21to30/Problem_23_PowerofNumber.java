package JavaPrograms_21to30;

import java.util.Scanner;

public class Problem_23_PowerofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = sc.nextInt();
		System.out.println("Enter the exponent: ");
		int exponent = sc.nextInt();
		
		int fixbase = base;
		int answer = 0;
		for(int i = 1; i < exponent; i++) {
			answer = base * fixbase;
			base = answer;
		}
		System.out.println("Answer: "+answer);
		
		sc.close();
	}
	
}

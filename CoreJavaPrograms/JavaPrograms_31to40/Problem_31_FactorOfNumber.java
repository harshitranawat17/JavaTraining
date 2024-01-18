package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_31_FactorOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.println(i+" ,");
			}
		}
		sc.close();
	}
}

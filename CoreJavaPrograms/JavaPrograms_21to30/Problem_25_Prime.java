package JavaPrograms_21to30;

import java.util.Scanner;

public class Problem_25_Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		boolean isprime = prime(num);
	
		if(isprime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not prime number");
		}
		
		sc.close();
	}
		
	public static boolean prime(int num) {
		
		boolean flag = true;
		for(int i = 2; i <= num/2 ; i++) {
			if(num % i == 0) {
				flag = false; 
				break;
			}
		}
		
		return flag;

	}
		
	
}

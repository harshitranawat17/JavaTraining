package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_33_CheckNumberIsSumofTwoPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
	    
        if (isPossible(num) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        sc.close();
	}
	
	public static boolean isPossible(int num) {
		
		if(isPrime(num) && isPrime(num-2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int num) {
		
		if (num <= 1)
            return false;
		
		for(int i=2; i <= num/2; i++ ) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

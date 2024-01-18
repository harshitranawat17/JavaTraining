package JavaPrograms_21to30;

import java.util.Scanner;

public class Problem_26_PrimeNumbersIntervals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int low = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int high = sc.nextInt();
		int i,j;
		boolean flag;
			
			
		
			for(i = low; i <= high ; i++) {
				
				if (i == 1 || i == 0)
	                continue;
				
				flag = true;
				
				for(j=2; j<=i/2; ++j) {
					
					if(i % j == 0) {
						flag = false; 
						break;
					}
				}
				
				if(flag == true) {
					System.out.println(i);
				}
			}
			
			
		
		sc.close();
	}
}

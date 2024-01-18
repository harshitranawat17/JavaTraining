package JavaPrograms_21to30;

import java.util.Scanner;

public class Problem_21_CountNumberofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();


		int count = 0; 
		while(num != 0) { 
			num /= 10; 
			++count; 
		} 
		System.out.println("count is "+count);

		sc.close();
	}
}

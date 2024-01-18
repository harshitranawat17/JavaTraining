package JavaPrograms_21to30;

import java.util.Scanner;
public class Problem_22_ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int reversed = 0;
		
		while (num != 0 ) {
			int singleDigit = num % 10;
			reversed = reversed * 10 +singleDigit;
			
			num /= 10;
		}
		System.out.println("reversed number: "+reversed);
		sc.close();
	}
}

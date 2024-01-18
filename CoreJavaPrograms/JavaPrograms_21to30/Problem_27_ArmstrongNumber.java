package JavaPrograms_21to30;

import java.util.Scanner;

public class Problem_27_ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int demonum, result = 0, remainder;
		demonum = num;
		
		while(demonum != 0) {
			remainder = demonum % 10;
			result += Math.pow(remainder, 3);
			demonum /= 10;
		}
		
		if(result == num) {
			System.out.println(num+" is an armstrong number");
		}else {
			System.out.println(num+" is not an armstrong number");
		}
		
		sc.close();
		
	}
}

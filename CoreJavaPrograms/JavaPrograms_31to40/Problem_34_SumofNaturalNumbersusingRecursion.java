package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_34_SumofNaturalNumbersusingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural number: ");
		int num = sc.nextInt();
		
		int result = Sum(num);
		System.out.println("Sum is: "+result);
		
		sc.close();
	}
	
	public static int Sum(int num) {
		if(num != 0) {
			return num + Sum(num-1);
		}else {
			return num;
		}
	}
}

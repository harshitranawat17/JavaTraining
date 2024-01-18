package JavaPrograms_11to20;

import java.util.Scanner;
public class Problem_16_GenerateMultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the table number: ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i<=10; i++) {
			int mul = num*i;
			System.out.println(num+" x "+i+" = "+mul);
		}
		sc.close();
		
	}
}

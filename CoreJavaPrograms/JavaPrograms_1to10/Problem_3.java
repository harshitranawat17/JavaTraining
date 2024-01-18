package JavaPrograms_1to10;

import java.util.Scanner;
public class Problem_3 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter first float value: ");
		float value1 = sc.nextFloat();
		System.out.print("Enter second float value: ");
		float value2 = sc.nextFloat();
		
		float result = Multiply(value1, value2);
		System.out.println("Result: "+result);
		
		sc.close();
	}
	
	public static float Multiply(float value1, float value2) {
		float mul = value1*value2;
		return mul;
	}
	
}

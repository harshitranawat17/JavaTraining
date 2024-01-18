package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_37_BinaryToDecimal_VV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Decimal to Binary");
		System.out.println("3. Exit");
		int choose = sc.nextInt();
		
		int binary, decimal, result;
		
		switch (choose) {
		case 1:
			System.out.println("Enter Binary number: ");
			binary = sc.nextInt();
			result = B2D(binary);
			System.out.println("Answer is: "+result);
			break;
		case 2:
			System.out.println("Enter decimal number: ");
			decimal = sc.nextInt();
			result = D2B(decimal);
			System.out.println("Answer is: "+result);
			break;
		case 3:
			break;
		default:
			System.out.println("invalid option");
			break;
		
		}
		sc.close();
	}
	
	public static int B2D(int binary) {
		int sum = 0;
		
		while(binary != 0) {
			int remainder = binary % 10;
			sum = (sum*2)+remainder;
			binary /= 10;
		}
		return sum;
	}
	
	public static int D2B(int decimal) {
		
		int sum = 0;
	    int remainder, i = 1;

	    while (decimal!=0) {
	    	remainder = decimal % 2;
	        decimal /= 2;
	        sum += remainder * i;
	        i *= 10;
	    }
	    
	    return sum;
	}
	
}

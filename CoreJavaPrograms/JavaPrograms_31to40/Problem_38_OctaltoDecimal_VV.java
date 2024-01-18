package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_38_OctaltoDecimal_VV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Octa to Decimal");
		System.out.println("2. Decimal to Octa");
		System.out.println("3. Exit");
		int choose = sc.nextInt();
		
		int octa, decimal, result;
		
		switch (choose) {
		case 1:
			System.out.println("Enter octa number: ");
			octa = sc.nextInt();
			result = O2D(octa);
			System.out.println("Answer is: "+result);
			break;
		case 2:
			System.out.println("Enter decimal number: ");
			decimal = sc.nextInt();
			result = D2O(decimal);
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
	
	public static int O2D(int octa) {
		
		int result = 0, i = 0;
        while(octa != 0){
            result += (octa % 10) * Math.pow(8, i);
            ++i;
            octa/=10;
        }
        return result;
	}
	
	public static int D2O(int decimal) {
		
		 	int result = 0, i = 1;
	        while (decimal != 0){
	            result += (decimal % 8) * i;
	            decimal /= 8;
	            i *= 10;
	        }
	        return result;
	}
}

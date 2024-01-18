package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_39_BinaryNumbertoOctal_VV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Bianry to Octa");
		System.out.println("2. Octa to binary");
		System.out.println("3. Exit");
		int choose = sc.nextInt();
		
		int octa, binary, result;
		
		switch (choose) {
		case 1:
			System.out.println("Enter binary number: ");
			binary = sc.nextInt();
			result = B2O(binary);
			System.out.println("Answer is: "+result);
			break;
		case 2:
			System.out.println("Enter Octa number: ");
			octa = sc.nextInt();
			result = O2B(octa);
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
	
	public static int B2O(int binary) {
		int octa = 0, decimal = 0, i = 0;

	    while (binary != 0) {
	      decimal += (binary % 10) * Math.pow(2, i);
	      ++i;
	      binary /= 10;
	    }

	    i = 1;

	    while (decimal != 0) {
	      octa += (decimal % 8) * i;
	      decimal /= 8;
	      i *= 10;
	    }

	    return octa;
	}
	
	public static int O2B(int octa) {
		
		int decimal = 0, i = 0;
	    int binary = 0;

	    while (octa != 0) {
	      decimal += (octa % 10) * Math.pow(8, i);
	      ++i;
	      octa /= 10;
	    }
	    i = 1;
	    while (decimal != 0) {
	      binary += (decimal % 2) * i;
	      decimal /= 2;
	      i *= 10;
	    }

	    return binary;
	
	}
}

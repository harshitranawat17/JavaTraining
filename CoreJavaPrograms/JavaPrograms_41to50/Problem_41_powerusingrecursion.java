package JavaPrograms_41to50;

import java.util.Scanner;

public class Problem_41_powerusingrecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		int base = sc.nextInt();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		
	    int result = power(base, power);

	    System.out.println(result);
	}

	public static int power(int base, int power) {
	    if (power != 0) {
	      return (base * power(base, power - 1));
	    }
	    else {
	      return 1;
	    }
	}
}

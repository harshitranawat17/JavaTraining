package JavaPrograms_121to130;

import java.util.Scanner;

public class Problem_129_Calculatesimpleinterestandcompoundinterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		double p = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double r = sc.nextDouble();
		System.out.println("Enter the time: ");
		double t = sc.nextDouble();
		System.out.print("Enter number of times interest is compounded: ");
	    int n = sc.nextInt();
		
		double simpleinterest = (p * r * t) / 100;
		
		double compundinterest = p * (Math.pow((1 + r/100), (t * n))) - p;
		
		System.out.println("simple interest: "+simpleinterest );
		System.out.println("compound interest: "+compundinterest);
		
		sc.close();
	}
}

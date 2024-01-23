package JavaPrograms_131to140;

import java.util.Scanner;

public class Problem_132_Checkiftwoofthreebooleanvariablesaretrue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first boolean value: ");
        boolean bool1 = sc.nextBoolean();
        System.out.println("enter second boolean value: ");
        boolean bool2 = sc.nextBoolean();
        System.out.println("enter third boolean value: ");
        boolean bool3 = sc.nextBoolean();

        if (checkboolean(bool1, bool2, bool3)) {
        	
            System.out.println("Two out of three boolean variables are true.");
            
        } else {
        	
            System.out.println("Two out of three boolean variables are not true.");
        }
        sc.close();
    }

    private static boolean checkboolean(boolean bool1, boolean bool2, boolean bool3) {
    	
        return (bool1 && bool2) || (bool1 && bool3) || (bool2 && bool3);
    }
}

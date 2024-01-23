package JavaPrograms_131to140;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Problem_134_CheckthebirthdayandprintHappyBirthdaymessage {
	
	  public static void main(String[] args) {
		  	Scanner sc = new Scanner(System.in);
		  	
		    System.out.println("enter date");
	        int birthDate = sc.nextInt();
	        System.out.println("enter month");
	        String mnth = sc.next();
	        Month birthMonth = Month.valueOf(mnth.toUpperCase());

	        if (isTodayBirthday(birthDate, birthMonth)) {
	        	
	            System.out.println("Happy Birthday!");
	        } else {
	            System.out.println("Not your birthday today");
	        }
	    }

	    private static boolean isTodayBirthday(int birthday, Month birthMonth) {
	        LocalDate today = LocalDate.now();

	        return today.getDayOfMonth() == birthday && today.getMonth() == birthMonth;
	    }
}

package JavaPrograms_61to70;

import java.util.concurrent.TimeUnit;

public class Problem_64_ConvertMillisecondstoMinutesandSeconds {
	
	public static void main(String[] args) {

	    long milliseconds = 1000000;

	    long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
	    System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");

	    long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
	    System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
	  }
}

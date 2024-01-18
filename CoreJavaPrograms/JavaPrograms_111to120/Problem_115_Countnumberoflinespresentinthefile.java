package JavaPrograms_111to120;

import java.io.File;
import java.util.Scanner;

public class Problem_115_Countnumberoflinespresentinthefile {
	 public static void main(String[] args) {

		    int count = 0;
		    try {

		      File file = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File.txt");

		      Scanner sc = new Scanner(file);

		      while(sc.hasNextLine()) {
		        sc.nextLine();
		        count++;
		      }
		      
		      System.out.println("Total Number of Lines: " + count);

		      sc.close();
		    } catch (Exception e) {
		      e.getStackTrace();
		    }
		  }
}

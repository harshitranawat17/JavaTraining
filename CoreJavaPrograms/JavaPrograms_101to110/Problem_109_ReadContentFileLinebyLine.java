package JavaPrograms_101to110;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Problem_109_ReadContentFileLinebyLine {
	
	public static void main(String[] args) {
	    try {

	      FileInputStream file = new FileInputStream("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File.txt");

	      BufferedInputStream input = new BufferedInputStream(file);

	      int i = input .read();

	      while (i != -1) {
	        System.out.print((char) i);
	        i = input.read();
	      }
	      input.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}

package JavaPrograms_101to110;

import java.io.FileInputStream;
import java.io.InputStream;
public class Problem_107_LoadFileInputStream {
	
	public static void main(String args[]) {

	    try {

	      InputStream input = new FileInputStream("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File.txt");

	      System.out.println("Data in the file: ");

	      int i = input.read();

	      while(i != -1) {
	    	  
	        System.out.print((char)i);
	        i = input.read();
	      }
	      input.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
}

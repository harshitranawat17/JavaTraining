package JavaPrograms_101to110;

import java.io.File;
import java.io.FileWriter;

public class Problem_108_CreateFileWriteFile {
	
	public static void main(String[] args) {

		String text = "Hello Harshit";
		
	    File file = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File1.txt");
	    try {
	    	
	      boolean value = file.createNewFile();
	      if (value) {
	        System.out.println("New Java File is created.");
	      }
	      else {
	        System.out.println("The file already exists.");
	      }
	      
	      FileWriter output = new FileWriter(file);

	      output.write(text);
	      System.out.println("Data is written to the file.");

	      output.close();
	      
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    
	    
	    
	  }
}

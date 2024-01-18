package JavaPrograms_111to120;

import java.io.File;
import java.net.URI;

public class Problem_114_Getrelativepathfromtwoabsolutepaths {
	
	public static void main(String[] args) {

	    try {
	      File absolutePath1 = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File.txt");
	      System.out.println("Absolute Path1: " + absolutePath1);
	      
	      File absolutePath2 = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice");
	      System.out.println("Absolute Path2: " + absolutePath2);

	      URI path1 = absolutePath1.toURI();
	      URI path2 = absolutePath2.toURI();

	      URI relativePath = path2.relativize(path1);

	      String path = relativePath.getPath();

	      System.out.println("Relative Path: " + path);

	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}

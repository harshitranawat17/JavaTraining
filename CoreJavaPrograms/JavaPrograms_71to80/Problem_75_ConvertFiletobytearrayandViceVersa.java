package JavaPrograms_71to80;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Problem_75_ConvertFiletobytearrayandViceVersa {
	
	public static void main(String[] args) {

		Path filePath = Paths.get("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_71to80/test.txt/");


        try {
            byte[] encoded = Files.readAllBytes(filePath);
            System.out.println(Arrays.toString(encoded));
        } catch (IOException e) {

    }
	
	//vise versa
	
	try {
      
		Path Path1 = Paths.get("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_71to80/test.txt/");
		Path filePath1 = Paths.get("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_71to80/test.txt/");

		byte[] encoded1 = Files.readAllBytes(Path1);
        Files.write(filePath, encoded1);
    } 
	catch (IOException e) {
    }
   }
}

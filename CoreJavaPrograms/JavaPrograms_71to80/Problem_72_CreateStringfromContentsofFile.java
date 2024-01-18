package JavaPrograms_71to80;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem_72_CreateStringfromContentsofFile {
		
	public static void main(String[] args) {
        try {
            Path filePath = Paths.get("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_71to80/test.txt/");

            String fileContents = readFileToString(filePath);

            System.out.println("File Contents:\n" + fileContents);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    private static String readFileToString(Path filePath) throws IOException {
        // Read all lines from the file and join them into a single string
        return String.join("\n", Files.readAllLines(filePath, StandardCharsets.UTF_8));
    }
	
}

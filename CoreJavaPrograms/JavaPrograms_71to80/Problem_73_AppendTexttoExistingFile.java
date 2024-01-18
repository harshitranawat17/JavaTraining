package JavaPrograms_71to80;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Problem_73_AppendTexttoExistingFile {
	
	public static void main(String[] args) {
        try {

            Path filePath = Paths.get("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_71to80/test.txt/");

            String newText = "I am Developer";

            appendTextToFile(filePath, newText);

            System.out.println("Text appended.");
        } catch (IOException e) {
            System.err.println("An error occurred while appending text to the file: " + e.getMessage());
        }
    }

    private static void appendTextToFile(Path filePath, String newText) throws IOException {
        // Append text to the file
        Files.write(filePath, newText.getBytes(), StandardOpenOption.APPEND);
    }
}

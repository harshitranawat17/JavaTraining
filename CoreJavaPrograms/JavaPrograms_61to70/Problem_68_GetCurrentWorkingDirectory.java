package JavaPrograms_61to70;

import java.nio.file.Paths;

public class Problem_68_GetCurrentWorkingDirectory {
	public static void main(String[] args) {

        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);

    }
}

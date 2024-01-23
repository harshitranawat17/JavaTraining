package JavaPrograms_121to130;

import java.util.Random;

public class Problem_123_Createrandomstrings {
	
	public static void main(String[] args) {
		
        int length = 10; 
        
        String randomString = generateRandomString(length);

        System.out.println("Random String: " + randomString);
    }

    private static String generateRandomString(int length) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder randomString = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {

            int randomIndex = random.nextInt(characters.length());


            randomString.append(characters.charAt(randomIndex));
        }

        return randomString.toString();
    }
}

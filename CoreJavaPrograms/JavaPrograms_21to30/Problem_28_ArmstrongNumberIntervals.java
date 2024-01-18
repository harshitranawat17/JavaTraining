package JavaPrograms_21to30;

import java.util.Scanner;

public class Problem_28_ArmstrongNumberIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int low = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int high = sc.nextInt();

        for (int number = low; number <= high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains the sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
        }

        sc.close();
    }
}


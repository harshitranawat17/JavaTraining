/*Algorithm:

1. Start
2. Import Scanner class and create a Scanner object named "sc" to read input from the user.
3. Prompt the user to enter an integer by displaying the message "Enter an Integer value: ".
4. Read the integer entered by the user using sc.nextInt() and store it in the variable value.
5. Display the entered integer by printing "Integer value is: " followed by the value.
6. Close the Scanner(sc) to release the resources as "sc.close()".
7. End
*/

package JavaPrograms_1to10;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Interger value: ");
		int value = sc.nextInt();
		
		System.out.println("Interger value is: "+value);

		sc.close();
	}

}

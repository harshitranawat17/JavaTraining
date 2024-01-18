package JavaPrograms_51to60;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Problem_57_ConvertStringtoDate {
	public static void main(String[] args) {
   
        String string = "2024-01-16";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}

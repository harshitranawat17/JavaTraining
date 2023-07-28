/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime_API;

/**
 *
 * @author harshit_ranawat
 */
import java.time.*;
import java.time.format.*;

public class DateTimeFormatterExp {
    public static void main(String[] args) {
            
        LocalDateTime d=LocalDateTime.now();
        
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df.format(d));
        
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(df1.format(d));
        
        DateTimeFormatter df2=DateTimeFormatter.ofPattern("dd/yyyy/yyyy HH:mm:ss");
        System.out.println(df2.format(d));
        
        DateTimeFormatter df3=DateTimeFormatter.ofPattern("dd/yyyy/mm HH:mm:ss");
        System.out.println(df3.format(d));
    }
}

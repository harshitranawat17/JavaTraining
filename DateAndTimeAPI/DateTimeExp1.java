/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTimeAPI;

/**
 *
 * @author harshit_ranawat
 */

import java.time.*;

public class DateTimeExp1 {
    public static void main(String[] args) {
        
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        
        int day=ld.getDayOfMonth();
        int mm=ld.getMonthValue();
        int yy=ld.getDayOfYear();
        
        System.out.println(day);
        System.out.println(mm)
;
        System.out.println(yy);
    }
}

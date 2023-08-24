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

public class DateTimeExp4 {
    public static void main(String[] args) {
        
        LocalDate bd=LocalDate.of(2001, Month.AUGUST, 02);
        LocalDate today=LocalDate.now();
        
        Period p1=Period.between(bd, today);
        
        System.out.println(p1);
        System.out.println(p1.getDays());
        System.out.println(p1.getMonths());
        System.out.println(p1.getYears());
        System.out.println(p1.toTotalMonths());
        
        int days=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
        System.out.println(days);
        
        System.out.println(bd.getYear());
        int by=bd.getYear();
        Year y=Year.of(by);
        System.out.println(y.isLeap());
    }
}

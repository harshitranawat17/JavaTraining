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

public class DateTimeExp2 {
    public static void main(String[] args) {
        
        LocalTime time=LocalTime.now();
        System.out.println(time);
        
        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        int n=time.getNano();
        
        System.out.println(h);
        System.out.println(m);
        System.out.println(s);
        System.out.println(n);
    }
}

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

public class DateTimeExp5 {
    public static void main(String[] args) {
        
        ZoneId zd=ZoneId.systemDefault();
        
        System.out.println(zd);
        System.out.println(zd.getRules());
        System.out.println(zd.getId());
        System.out.println("");
        
        ZoneId la=ZoneId.of("America/Los_Angeles");
        
        System.out.println(la);
        System.out.println(la.getRules());
        System.out.println(la.getId());
    }
}

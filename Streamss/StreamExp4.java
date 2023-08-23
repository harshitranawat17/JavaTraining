/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */
import java.util.ArrayList;


public class StreamExp4 {
    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<>();
        
        l.add("Harshit");l.add("Roshan");l.add("abhi");
        l.add("Jaggu");
        l.add("Swapnil");
        l.add("Manali mam");
        
        System.out.println(l);
        
        //using stream with count()
        
        long count = l.stream().filter(s -> s.length()>=6).count();
        
        System.out.println("The number of string whose length >=9: "+count);

    }
}

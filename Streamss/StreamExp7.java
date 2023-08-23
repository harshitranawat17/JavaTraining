/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */

//foreach example

import java.util.ArrayList;

public class StreamExp7 {
    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<>();
        
        l.add("Harshit");l.add("Roshan");l.add("abhi");
        l.add("Jaggu");
        l.add("Swapnil");
        l.add("Manali mam");
        
        System.out.println(l);
        
        System.out.println();
        
        //using stream with foreach() lambda function
        
        System.out.println("Using lambda function: ");
        
                
        l.stream().forEach(s -> System.out.println(s));
        
        System.out.println();
        //using stream with foreach() method reference
        
        System.out.println("Using method reference: ");
        
        l.stream().forEach(System.out :: println);
        
    }
}

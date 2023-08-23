/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */
//min max example

import java.util.ArrayList;

public class StreamExp6 {
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();
        
        l.add(2);l.add(10);l.add(15);
        l.add(20);
        l.add(30);
        l.add(25);
        
        System.out.println(l);
        
        //using stream with min() and max()
        
        Integer min = l.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        
        System.out.println("Minimum value is: "+min);
        
        Integer max = l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        
        System.out.println("Minimum value is: "+max);
        
    }
}

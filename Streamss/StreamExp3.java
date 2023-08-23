/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */

//Collect Example

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExp3 {
    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<String>();
        
        l.add("Harshit");l.add("Roshan");l.add("abhi");
        l.add("Jaggu");
        l.add("Swapnil");
        l.add("Manali mam");
        
        System.out.println(l);
        
        //using stream collect() with filter
        
        List<String> l1 = l.stream().filter(s -> s.length()>=6).collect(Collectors.toList());
        
        System.out.println(l1);
        
        //using stream collect() with map
        
        List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        
        System.out.println(l2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */
//streamof example

import java.util.stream.*;

public class StreamExp9 {
    public static void main(String[] args) {
        
        
        System.out.println("For group of values: ");
        
        Stream<Integer> s = Stream.of(9,99,999,9999,99999);
        
        s.forEach(System.out :: println);
        
        System.out.println("For arrays: ");
        
        Double[] d = {10.0, 10.1, 10.2, 10.3, 10.4, 10.5};
        
        Stream<Double> s1 = Stream.of(d);
        
        s1.forEach(System.out :: println);
        
    }
    
}

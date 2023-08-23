/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */
//toArray Exp

import java.util.ArrayList;

public class StreamExp8 {
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();
        
        l.add(2);l.add(10);l.add(15);
        l.add(20);
        l.add(30);
        l.add(25);
        
        System.out.println(l);
        
        //using stream toArray()
        
        Integer[] arr = l.stream().toArray(Integer[] :: new);
        
        for(Integer x : arr){
            System.out.println(x);
        }
     }
}

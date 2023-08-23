/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */

//Map example

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExp2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        l.add(0);l.add(10);l.add(15);
        l.add(20);
        l.add(30);
        l.add(25);
        
        System.out.println(l);
        //using streams map
        
        List<Integer> l1 = l.stream().map(I->I*2).collect(Collectors.toList());
        
        System.out.println(l1);
    }
}

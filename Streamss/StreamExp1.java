/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streamss;

/**
 *
 * @author harshit_ranawat
 */

//Filter Example    
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExp1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        l.add(0);l.add(10);l.add(15);
        l.add(20);
        l.add(30);
        l.add(25);
        
        System.out.println(l);
        //using streams filter
        
        List<Integer> l1 = l.stream().filter(I->I%2==0).collect(Collectors.toList());
        
        System.out.println(l1);
    }
}

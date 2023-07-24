/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author harshit_ranawat
 */
import java.util.*;
public class TreeSetExp {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        
        ts.add(25); //it will add betweem 10-30, because of tree
        
        //ts.ceiling(55);  //it will display equal or greter then the given element from the list.
       
        //display sorted element
        System.out.println(ts);
    }
 
}

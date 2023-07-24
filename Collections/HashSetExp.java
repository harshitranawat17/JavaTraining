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
public class HashSetExp {
    public static void main(String[] args) {
        
        // only 0.75% data can be store becuase of load factor initialize
        // hashset is preferable when it is used in constant time 
        
        HashSet<Integer> hs=new HashSet<>(20,0.75f); 
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);  //dublicate element will not print and also print not in same order
        
        System.out.println(hs);
    }
}

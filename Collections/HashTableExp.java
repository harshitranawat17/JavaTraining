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
public class HashTableExp {
    public static void main(String[] args) {
        
        Hashtable<Integer,String> ht=new Hashtable<>();
        
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        
        //same as iterator
        Enumeration e = ht.elements();
        
        while(e.hasMoreElements()){
            System.err.println(e.nextElement());
        }
        
        //for adding new key with value, if its not there
        ht.computeIfAbsent(7, (k)->"Z"+k);

        System.out.println(ht);
    }
}

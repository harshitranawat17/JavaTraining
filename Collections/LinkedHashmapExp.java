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

public class LinkedHashmapExp {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5){
        
        //if want to mantain the order of elements by least access, means which element is not used or access, come first.
        //LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5,0.75f,true);
        
            //this method will not include element after 5th element,
            //if the user include the 6th element, the first element will be deleted
            //to maintain the order of 5
            @Override
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        
        };
        
        
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(6,"F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
    }
}

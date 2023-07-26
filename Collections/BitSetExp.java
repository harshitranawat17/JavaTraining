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

public class BitSetExp {
    public static void main(String[] args) {
        
        //it work as true and false as bits(And, OR, Xor....)
        BitSet bs1=new BitSet();
        
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);
           
        BitSet bs2=new BitSet();
       // bs2.set(0);
        bs2.set(1);
       // bs2.set(2);
        bs2.set(3);
       // bs2.set(4);
        bs2.set(5);
       // bs2.set(6);
        bs2.set(7);
       // bs2.set(8);
        
        bs1.and(bs2);
        bs1.or(bs2);
        
        bs1.flip(0,bs1.length());
        System.out.println(bs1);
    }
}

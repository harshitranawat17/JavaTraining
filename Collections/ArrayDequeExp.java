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

public class ArrayDequeExp {
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer> dq=new ArrayDeque<>();
         
         dq.offerLast(10);   //insert element from last without exception at all.
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);
         
         //if we insert element from first and remove element from last then its queue as viseversa  also
         //if we insert and delete element from same side , then its stack
         
         dq.pollFirst(); //remove element from last without exception at all.
         
         /*
         dq.offerFirst(1); //insert element from first without exception at all.
         dq.offerFirst(2); 
         dq.offerFirst(3);
         dq.offerFirst(4);
         */
         
         dq.forEach((x)->System.out.println(x));
    }
}

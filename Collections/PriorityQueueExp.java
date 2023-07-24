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

public class PriorityQueueExp implements Comparator<Integer>{
    
    //if we want to insert and delete as largest element priority, then 
    //we need to implement Comparator<>  interface;
    
    @Override
    public int compare(Integer o1, Integer o2){
       if(o1<o2) return 1;
       if(o1>o2) return -1;
       return 0;
    }
    
    public static void main(String[] args) {
        
        
        
        //priority queue work as heap in binary tree
        //Insert and delete node based on priority of element
        //By default insertion and deletion happen which is small element.
        
        
        
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>( new PriorityQueueExp());
        
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        
        System.err.println("First element "+pq.peek()); //print first element based on small or large priority.
        
        pq.poll(); //after remove head element based on small or large priority.
        
        pq.forEach((x) -> System.out.println(x));
    }
}

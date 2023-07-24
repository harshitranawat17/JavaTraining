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

public class LinkedListExp {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> arr = new LinkedList<>();
        
        
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(20,30,40,50));
        
        arr.add(40);
        arr.add(0, 1);
        
        arr.addFirst(2);
        arr.addLast(4);
        
        System.out.println(arr.getFirst() +" "+ arr.getLast());
        
        arr.peek(); //get first element
        arr.poll(); //remove  element
        
        
        arr.addAll(arr1);
        
        
        
        System.out.println(arr.get(0)); //get element from index value
        
        System.out.println(arr.indexOf(40)); // get index of element
        
        arr.lastIndexOf(40);// get the last index of dublicate element
        
        arr.remove(2);  //remove element from index
        
        arr.set(1, 30);  //replace element
        
        System.out.println(arr);  //print the array list without loop
        
        //-------------------------print with different loops---------------//
        
        for(int i=0;i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        for(var x:arr){
            System.out.println(x);
        }
        
        
        //print element using iterator
        Iterator<Integer> it = arr.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        //For each using diff method
        
        arr.forEach(n -> show(n));
        
        
    }
    
    static void show(int n){
        System.out.println( n);
    }
    
}

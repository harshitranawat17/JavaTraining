/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author harshit_ranawat
 */

public class GenericArray<T> {
    
    T data[] = (T[]) new Object[3];   //typecasting from object to generic
    
    public static void main(String[] args) {
        
        GenericArray<String> gd = new GenericArray<>();  
        
        gd.data[0] ="Harshit";
        gd.data[1] = "Ranawat";
        
        //gd.data[2] = new Integer(10);  //gives an error at compile time because generic array is String type
         
        String str = gd.data[0];
        
        System.out.println(str);
        System.err.println(gd.data[1]);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author harshit_ranawat
 */
public class GenericDemo {
    
    public static void main(String[] args) {
        
        Object obj = new String("Harshit");
        
        //obj = new Integer(10);    // it cannot conevert (int to string)
        
        String str = (String)obj;   //typecasting
        
        System.out.println(str);
    }
}

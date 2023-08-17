/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierInterface;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.Supplier;


public class SupplierExp1 {
    public static void main(String[] args) {
        
        Supplier<String> sp = () -> {
            
                    String[] s = {"Harshit","Roshan","Jigyasa","Abhigyan","Swapnil"};
                    int x = (int)(Math.random()*5);
                    
                    return s[x];
         };
        
        System.err.println(sp.get());
        System.err.println(sp.get());
        System.err.println(sp.get());
    }
}

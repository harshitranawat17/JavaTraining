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

public class SupplierExp3 {
    public static void main(String[] args) {
        
        Supplier<String> otps=()->{
            String otp="";
            for(int i =1;i<=6;i++)
            {
                otp=otp+(int)(Math.random()*10);
            }
            return otp;
    
        };
        
        System.out.println(otps.get());
        System.out.println(otps.get());
        System.out.println(otps.get());
        System.out.println(otps.get());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colon;

/**
 *
 * @author harshit_ranawat
 */
interface Interf
{
    public void m1();
}

public class MethodReferenceExp1 {
    
    public static void m2(){
        System.out.println("Implementation by method reference");
    }
    
    public static void main(String[] args) {
        
        Interf i = MethodReferenceExp1 :: m2;
        
        i.m1();
    }
}

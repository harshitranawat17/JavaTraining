/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Default_and_static;

/**
 *
 * @author harshit_ranawat
 */
interface Left {
    
    default void m1() {
        System.out.println("Left Default Method");
    }
}

interface Right {
    
    default void m1() {
        System.out.println("Right Default Method");
    }
}

public class DefaultExp implements Left,Right{
    
    public void m1() {
        //System.out.println("Test Class Method"); 
        
        Left.super.m1();
        //Right.super.m1();
    }
    
    public static void main(String[] args) {
        DefaultExp t = new DefaultExp();
        
        t.m1();
    }
}

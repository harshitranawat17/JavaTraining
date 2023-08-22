package Colon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harshit_ranawat
 */
public class MethodReferenceExp2 {
    
    public void m1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
    
    public static void main(String[] args) {
        
        MethodReferenceExp2 t = new MethodReferenceExp2();
        
        Runnable r = t :: m1;
        
        Thread t1 = new Thread(r);
        
        t1.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author harshit_ranawat
 */
public class JavaIsAliveExp extends Thread{
    public void run()  
    {  
        try  
        {  
            Thread.sleep(300);  
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
        }  
        catch (InterruptedException ie) {  
        }  
    }  
    public static void main(String[] args)  
    {  
        JavaIsAliveExp thread1 = new JavaIsAliveExp();  
        System.out.println("before starting thread isAlive: "+thread1.isAlive());  
        thread1.start();  
        System.out.println("after starting thread isAlive: "+thread1.isAlive());  
    }  
}

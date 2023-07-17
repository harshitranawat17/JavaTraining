/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author harshit_ranawat
 */
public class JavaSetPriorityExp1 extends Thread{
    
    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        JavaSetPriorityExp1 t1=new JavaSetPriorityExp1();
        t1.setPriority(Thread.MAX_PRIORITY);    
        t1.start();    
    }    
}

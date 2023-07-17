/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author harshit_ranawat
 */
public class JavaResumeExp extends Thread{
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try 
            {  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        JavaResumeExp thread1=new JavaResumeExp ();    
        JavaResumeExp thread2=new JavaResumeExp ();   
        JavaResumeExp thread3=new JavaResumeExp ();   
        thread1.start();  
        thread2.start();  
        thread2.suspend();
        thread3.start();   
        thread2.resume();
    }    
}

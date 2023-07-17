/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harshit_ranawat
 */
public class ThreadDemo extends Thread{
    
    public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try 
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }   
    
    
    public static void main(String[] args) {
        
        ThreadDemo thread1 = new ThreadDemo();    
        ThreadDemo thread2 = new ThreadDemo();    
        ThreadDemo thread3 = new ThreadDemo();    
        thread1.start();  //..pending 
       try 
        {    
        thread1.join();    
        }catch(Exception e){System.out.println(e);}  
       
        thread2.start(); //pending 
        thread3.start();  //..pending
    }
}

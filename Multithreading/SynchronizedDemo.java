/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author harshit_ranawat
 */

class Mydata{

    synchronized public void display(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
            
        }
        System.err.println("");
    }

}

class Thread_1 extends Thread{
    
    Mydata d;
    public Thread_1(Mydata d){
        this.d=d;
    }
    
    public void run(){
        d.display("Hello world");
    }
}

class Thread_2 extends Thread{
    
    Mydata d;
    public Thread_2(Mydata d){
        this.d=d;
    }
    
    public void run(){
        d.display("welcome here");
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        
        Mydata data = new Mydata();
        
        
        Thread_1 t1 = new Thread_1(data);
        Thread_2 t2 = new Thread_2(data);
        
        t1.start();
        t2.start();
        
    }
}

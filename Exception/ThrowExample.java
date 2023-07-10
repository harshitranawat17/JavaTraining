/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author harshit_ranawat
 */
public class ThrowExample {
    public static void method1() throws Exception{
        int a=10;
        int b=0;
        if(b==0){
            throw new Exception("error while dividing");
        }
        int c=a/b;
        System.out.println(c);
    }
   
    public static void main(String[] args) throws Exception {
                try{
                    method1();
                }
                catch(Exception e){
                    System.out.println(e);
                }
               System.out.println("hello ");
    }
    
} 


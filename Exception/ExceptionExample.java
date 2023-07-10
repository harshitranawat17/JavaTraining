/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author harshit_ranawat
 */
public class ExceptionExample {
    public static void method1(){
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
    public static void method(){
        method1();
    }
    public static void main(String[] args) {
       try
       {
           method();
       }
       catch (Exception e){
           System.out.println("divisor can not be zero");
       }
        System.out.println("hello ");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author harshit_ranawat
 */
public class ArithmeticException {
    public static void main(String[] args) {
       try{
           int a=10;
       
        int b=10;
        int c= a/b;
        
        System.out.println(c);
        
       }
       catch(Exception e){
        System.out.println("aithmetic exception ");
       }
       System.out.println("hello");
    }
}
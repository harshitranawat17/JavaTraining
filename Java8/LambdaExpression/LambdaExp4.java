/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LambdaExpression;

/**
 *
 * @author harshit_ranawat
 */
interface Interf1{
    public int  m1(String s);
}


public class LambdaExp4 {
    
    public static void main(String[] args) {
        
        //Interf1 i = (String s)->{return s.length();}; 
        
        Interf1 i = s->s.length();
        System.out.println(i.m1("hello"));
    }
}


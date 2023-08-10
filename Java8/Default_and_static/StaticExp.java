/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Default_and_static;

/**
 *
 * @author harshit_ranawat
 */
interface Interf {
    
    public static void sum(int a, int b) {
        System.out.println("The Sum:"+(a+b));
    }
}

public class StaticExp {
    public static void main(String[] args) {
        StaticExp t = new StaticExp();
        
        //t.sum(10,20);              //error
        //StaticExp.sum(10,20);      //error
        
        Interf.sum(10, 20);
    }
}

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
    public void m1(int par, int par1);
}

class Demo1 implements Interf1{
    
    public void m1(int a, int b){
        System.out.println((a+b));
    }
}

public class InterfaceWithoutLambda {
    
    public static void main(String[] args) {
        Interf1 i = new Demo1();
        i.m1(10,20);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LambdaExpression;

/**
 *
 * @author harshit_ranawat
 */
interface Interf {

    public void m1();
}

public class AnnonymsExp2 {
    
    int x = 10;
    public void m2() {
        int y = 20;
        Interf i = () -> {
            System.out.println(x); //10
            System.out.println(y); //20
            x = 888;
            //y = 999; //error
        };
        i.m1();
        //y = 777;
    }
    
    public static void main(String[] args) {
        
        AnnonymsExp2 t = new AnnonymsExp2();
        t.m2();
       
    }
}

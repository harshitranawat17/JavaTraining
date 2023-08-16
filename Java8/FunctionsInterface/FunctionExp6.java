/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionsInterface;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.*;

class FunctionExp6 {

    public static void main(String[] args) {
        
        //identity static method will return same input value
        Function<String, String> f1 = Function.identity();
        String s2 = f1.apply("durga");
        System.out.println(s2);
    }
}

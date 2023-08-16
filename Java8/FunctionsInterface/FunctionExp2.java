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

public class FunctionExp2 {
    public static void main(String[] args) {
        
        String s="Harshit Ranawat Software Engineer Ahmdabaad";
        
        Function<String,String> f= s1->s1.replaceAll(" ","");
        System.out.println(f.apply(s));
    }
}

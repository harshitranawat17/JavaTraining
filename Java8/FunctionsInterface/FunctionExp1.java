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

public class FunctionExp1 {
    public static void main(String[] args) {
        
        Function<String, Integer> f = s ->s.length();
        
        System.out.println(f.apply("Harshit"));
        System.out.println(f.apply("Brainvire"));
    }
}

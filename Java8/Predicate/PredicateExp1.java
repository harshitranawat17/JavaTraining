/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package predicate;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.Predicate;


public class PredicateExp1 {
    public static void main(String[] args) {
        
        Predicate<Integer> p = I->(I>10);
        
        System.out.println(p.test(100));
        System.out.println(p.test(7));
        //System.out.println(p.test(true)); //error
    }
}

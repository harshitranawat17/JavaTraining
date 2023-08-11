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

public class PredicateExp3 {
    public static void main(String[] args) {
            
        String[] names={"Sunny","Kajal","Mallika","Katrina","Kareena"};
        
        Predicate<String> startsWithK=s->s.charAt(0)=='K';
        
        System.out.println("The Names starts with K are:");
        for(String s: names)
        {
            if(startsWithK.test(s))
            {
                System.out.println(s);
            }
        }
    }
}

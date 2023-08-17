/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsumerInterface;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.Consumer;

public class ConsumerExp1 {
    public static void main(String[] args) {
        
        //void 
        Consumer<String> c = s -> System.out.println(s);
        
        c.accept("Harshit");
        c.accept("Java");
    }
}

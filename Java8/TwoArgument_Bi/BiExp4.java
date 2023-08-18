/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument_Bi;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.*;

class BiExp4 {

    public static void main(String[] args) {
        BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);
        c.accept("durga", "soft");
    }
}

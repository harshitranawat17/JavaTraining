/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierInterface;

/**
 *
 * @author harshit_ranawat
 */

/*
Rules:
1. length should be 8 characters
2. 2,4,6,8 places only digits
3. 1,3,5,7 only Capital Uppercase characters,@,#,$
 */
import java.util.function.Supplier;

public class SupplierExp4 {

    public static void main(String[] args) {

        Supplier<String> s = ()-> {
            
            
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
            
            //1
            Supplier<Integer> d = () -> (int) (Math.random() * 10);
           
            Supplier<Character> c = () -> symbols.charAt((int)(Math.random() * 29));
            
            String pwd = "";
            
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {   //2
                    pwd = pwd + d.get();
                } else {
                    pwd = pwd + c.get();  //3
                }
            }
            return pwd;
        };
        
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}

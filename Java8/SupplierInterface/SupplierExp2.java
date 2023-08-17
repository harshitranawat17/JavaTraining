/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierInterface;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.Supplier;
import java.util.Date;

public class SupplierExp2 {
    public static void main(String[] args) {
        
        Supplier<Date> sp = () -> new Date();
        
        System.out.println(sp.get());
    }
}

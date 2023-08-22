/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colon;

/**
 *
 * @author harshit_ranawat
 */
class Sample{

    Sample() {
        System.out.println("sample constructor executed & object creation");
    }
}

interface Interf1{
    
    public Sample get();
}

public class ConstructorReferenceExp3 {
    public static void main(String[] args) {
        
        Interf1 i = Sample :: new;
        
        Sample s = i.get();
    }
}

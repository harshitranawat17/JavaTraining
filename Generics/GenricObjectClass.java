/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author harshit_ranawat
 */

class Data<T>{
    
    private T obj;
    
    public void setData(T v){
        obj=v;
    }
    public T getData(){
        return obj;
    }
    
    
}

public class GenricObjectClass {
    
    public static void main(String[] args) {
        Data<Integer> s=new Data<>();
        s.setData(new Integer(10));
        System.out.println(s.getData());
    }
}

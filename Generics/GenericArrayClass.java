/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author harshit_ranawat
 */
class MyArray1<T>{
    
    T A[] = (T[])new Object[10];       //generic class array
    
    int length = 0;
    
    public void setData(T v){
        A[length++] = v;
    }
    
    public void display(){
        for(int i = 0; i<length;i++){
            System.out.println(A[i]);
        }
    }
}

public class GenericArrayClass {
     public static void main(String[] args) {
        MyArray1<Integer> arr = new MyArray1<>();
        
        arr.setData(new Integer(10));
        arr.setData(new Integer(20));
        arr.setData(new Integer(30));
        
        arr.display();
    }
}

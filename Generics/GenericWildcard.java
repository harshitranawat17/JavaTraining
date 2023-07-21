/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

class MyArray<T>{
    
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

/**
 *
 * @author harshit_ranawat
 */
public class GenericWildcard {
    /*
    public void show1(MyArray<? extends Number> v){   //upperbound from number
    
        v.display();
    }
    */
    
    public void show(MyArray<?> v){
    
        v.display();
    }
    
    public static void main(String[] args) {
        
        MyArray<Integer> arr = new MyArray<>();
        
        arr.setData(10);
        arr.setData(20);
        
        MyArray<String> arr1 = new MyArray<>();
        
        arr1.setData("Hi");
        arr1.setData("Hello");
        
        GenericWildcard g = new GenericWildcard();
        g.show(arr);
        g.show(arr1);
        
        //g.show1(arr);
        //g.show1(arr1);
        
                
    }
}

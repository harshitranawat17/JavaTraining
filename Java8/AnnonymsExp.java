/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LambdaExpression;

/**
 *
 * @author harshit_ranawat
 */
interface inf1{
    public void print();
    public void show();
}
public class AnnonymsExp {
    public static void main(String[] args) {
        
        //inf1 in1=()->System.out.println("print");
        inf1 in2=new inf1(){
            
            @Override
            public void print(){
                System.out.println("print");;
            }
            
            @Override
            public void show(){
                System.out.println("show");
            }
        };
        
        //in1.print();
        in2.print();
        in2.show();
    }
}



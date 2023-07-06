/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author harshit_ranawat
 */
class Rectangle
{
    int length;
    int breadth;
    int x=10;
    
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    int x=20;
    
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}


public class ThisSuper 
{
    public static void main(String[] args) 
    {
    
           Cuboid c=new Cuboid(10,5,15);
           c.display();
        
    }   
}


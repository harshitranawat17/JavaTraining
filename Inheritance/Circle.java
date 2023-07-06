/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author harshit_ranawat
 */
//parent class
class Circle1
{
    public double radius;
    
    public double area()
    {
        return Math.PI * radius *radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

//child class
class Cylinder extends Circle1
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
    
}

//main class
public class Circle 
{
        //main method
       public static void main(String[] args) 
       {
           Cylinder c=new Cylinder();
          
           c.radius=7;
           c.height=10;
           
           System.out.println("Volume "+c.volume());
           System.out.println("Area "+c.area());
          
       }
    
}

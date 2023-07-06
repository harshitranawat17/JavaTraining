/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;



abstract class Shape
{
   abstract public double perimeter();
   abstract public double area();
}

class Circle extends Shape
{
    double radius;
    
    @Override
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }
            
}
        
class Rectangle extends Shape
{
    double length;
    double breadth;
    
    @Override
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    @Override
    public double area()
    {
        return length*breadth;
    }
            
}

public class SCAbstract1 
{
    public static void main(String[] args) 
    {
        //rectangle
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        
        Shape s=r;
        
        System.out.println(s.area());

        //circle
        Circle c = new Circle();
        c.radius = 5;
        
        Shape sh = c;
        System.out.println(sh.area());
        System.out.println(sh.perimeter());
     
    }  
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author harshit_ranawat
 */




class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}
    
}

class LuxaryCar extends Car
{
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}
    
}

public class OverridingExample 
{

    public static void main(String[] args) 
    {
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        //c.openRoof();
    }
    
}
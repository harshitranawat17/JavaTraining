/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author harshit_ranawat
 */
import java.util.*;
  /*
  The Comparable interface is used to compare an object 
  of the same class with an instance of that class, 
  it provides ordering of data for objects of the user-defined class. 
  The class has to implement the java. lang.
  */
class Point implements Comparable{
    int x;
    int y;
    
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "x = "+x+", y = "+y;
    }
    
    
    //overriding compateto method to compare instance of class
    @Override
    public int compareTo(Object o){
        
        Point p = (Point) o;
        
        if(this.x < p.x) return -1;
        else if(this.x > p.x) return 1;
        else{
            if(this.y < p.y) return -1;
            else if(this.y > p.y) return 1;
            else return 0;   
        }  
    }
}

public class TreeSetWithComparableInterface {
    
    public static void main(String[] args) {
        
        TreeSet<Point> ts;
        ts = new TreeSet<>();
        
        ts.add(new Point(2,3));
        ts.add(new Point(6, 5));
        ts.add(new Point(5, 2));
       
        System.err.println(ts);
        
    }
}

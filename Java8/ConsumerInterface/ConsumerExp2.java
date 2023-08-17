/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsumerInterface;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.Consumer;
import java.util.*;

class Movie1
{
    String name;
    String hero;
    String heroine;
    
    Movie1(String name,String hero,String heroine){
        
        this.name=name;
        this.hero=hero;
        this.heroine=heroine;
    }
}

public class ConsumerExp2 {
    public static void main(String[] args) {
        
        ArrayList<Movie1> l= new ArrayList<Movie1>();
        populate(l);
        
        Consumer<Movie1> c = m -> {
            
            System.out.println("Movie Name:"+m.name);
            System.out.println("Movie Hero:"+m.hero);
            System.out.println("Movie Heroine:"+m.heroine);
            System.out.println();
        };
        
        for(Movie1 m : l){
            
            c.accept(m);
        }
        
        
    }
    
    public static void populate(ArrayList<Movie1> l)
    {
        l.add(new Movie1("Bahubali","Prabhas","Anushka"));
        l.add(new Movie1("Rayees","Sharukh","Sunny"));
        l.add(new Movie1("Dangal","Ameer","Ritu"));
        l.add(new Movie1("Sultan","Salman","Anushka"));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsumerInterface;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.*;
import java.util.*;

class Movie
{
    String name;
    String result;
    
    Movie(String name,String result)
    {
        this.name=name;
        this.result=result;
    }
}

public class ConsumerExp4 {
    public static void main(String[] args) {
        
        Consumer<Movie> c1=m->System.out.println("Movie:"+m.name+" is ready to release");

        Consumer<Movie> c2=m->System.out.println("Movie:"+m.name+" is just Released and it is:"+m.result);

        Consumer<Movie> c3=m->System.out.println("Movie:"+m.name+" information storing in the database");
        
        //default method
        Consumer<Movie> chainedc = c1.andThen(c2).andThen(c3);
        
        Movie m1= new Movie("Bahubali","Hit");
        chainedc.accept(m1);
        
        Movie m2= new Movie("Spider","Flop");
        chainedc.accept(m2);
        
        
     
    }
}

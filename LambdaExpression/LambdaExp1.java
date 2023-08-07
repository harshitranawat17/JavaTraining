/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LambdaExpression;

/**
 *
 * @author harshit_ranawat
 */
import java.util.*;
import java.util.Collection;
class Emp{
    int id;
    String name;
    public Emp(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
    return name+":"+id;
    }
}

public class LambdaExp1 {
    public static void main(String[] args) {
        Emp e1=new Emp(1,"B");
        Emp e2=new Emp(3,"C");
        Emp e3=new Emp(2,"A");
        
        ArrayList<Emp> al=new ArrayList<>();
        
        al.add(e1);
        al.add(e3);
        al.add(e2);
        
        Collections.sort(al,(a,b)->(a.id<b.id)?-1:(a.id>b.id)?1:0);
        
        System.out.println(al);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PredicateFunctions;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.Predicate;
import java.util.ArrayList;

class Employee {

    String name;
    String designation;
    double salary;
    String city;

    Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        String s = String.format("[%s,%s,%.2f,%s]", name, designation, salary, city);
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if(name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city.equals(e.city))
            return true;
        else
            return false;
    }
}

public class PredicateExp7 {
    public static void main(String[] args) {
        
      
        
        ArrayList<Employee> list = new ArrayList<Employee>();
        populate(list);
        
        Predicate<Employee> p1 = emp->emp.designation.equals("Manager");
        System.err.println("Manager's Information: ");
        display(p1, list);
        
        Predicate<Employee> p2=emp->emp.city.equals("Bangalore");
        System.out.println("Bangalore Employees Information:");
        display(p2,list);
        
        Predicate<Employee> p3=emp->emp.salary<20000;
        System.out.println("Employees whose slaray <20000 To Give Increment:");
        display(p3,list);
        
        System.out.println("All Managers from Bangalore city for Pink Slip:");
        display(p1.and(p2),list);
        
        System.out.println("Employees Information who are either Managers or salary <20000");
        display(p1.or(p3),list);
        
        System.out.println("All Employees Information who are not managers:");
        display(p1.negate(),list);
        
        
        //is Equal method
        Predicate<Employee> isCEO=Predicate.isEqual(new Employee("Harshit","CEO",30000,"Hyderabad"));
        
        Employee e1=new Employee("Harshit","CEO",30000,"Hyderabad");
        Employee e2=new Employee("Roshan","Manager",20000,"Hyderabad");
        
        System.out.println(isCEO.test(e1));//true
        System.out.println(isCEO.test(e2));//false
        
    }
    
    public static void populate(ArrayList<Employee> list){
        
        list.add(new Employee("Harshit","CEO",30000,"Hyderabad"));
        list.add(new Employee("Roshan","Manager",20000,"Hyderabad"));
        list.add(new Employee("Abhi","Manager",20000,"Bangalore"));
        list.add(new Employee("Swapnil","Lead",15000,"Hyderabad"));
    }
    
    public static void display(Predicate<Employee> p, ArrayList<Employee> list){
        
        for(Employee e : list){
            if(p.test(e)){
                System.err.println(e);
            }
        }
        System.out.println("**************************************************");
    }
    
    
}

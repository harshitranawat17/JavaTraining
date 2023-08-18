/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument_Bi;

/**
 *
 * @author harshit_ranawat
 */
import java.util.function.*;
import java.util.*;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class BiExp6 {

    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<Employee>();
        populate(l);
        BiConsumer<Employee, Double> c = (e, d) -> e.salary = e.salary + d;
        for (Employee e : l) {
            c.accept(e, 500.0);
        }
        for (Employee e : l) {
            System.out.println("Employee Name:" + e.name);
            System.out.println("Employee Salary:" + e.salary);
            System.out.println();
        }
    }

    public static void populate(ArrayList<Employee> l) {
        l.add(new Employee("Harshit", 1000));
        l.add(new Employee("Sunny", 2000));
        l.add(new Employee("Bunny", 3000));
        l.add(new Employee("Chinny", 4000));
    }
}

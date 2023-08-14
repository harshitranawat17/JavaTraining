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

class SoftwareEngineer {

    String name;
    int age;
    boolean isHavingGf;

    SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        return name;
    }
}

class PredicateExp6 {

    public static void main(String[] args) {
        
        SoftwareEngineer[] list = {new SoftwareEngineer("Harshit", 25, true),
            new SoftwareEngineer("Roshan", 15, false),
            new SoftwareEngineer("Abhigyan", 26, true),
            new SoftwareEngineer("Swapnil", 17, false),
        };
        
        Predicate<SoftwareEngineer> allowed = se -> se.age >= 18 && se.isHavingGf;
        
        System.out.println("The Allowed Members into Pub are:");
        
        for (SoftwareEngineer se : list) {
            if (allowed.test(se)) 
                System.err.println(se);
        }
    }
}
           

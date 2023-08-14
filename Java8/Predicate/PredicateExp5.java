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
import java.util.Scanner;

class User {

    String username;
    String pwd;

    User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
}

class PredicateExp5 {

    public static void main(String[] args) {
        
        Predicate<User> p = u -> u.username.equals("Harshit") && u.pwd.equals("java");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter User Name:");
        String username = sc.next();
        System.out.println("Enter Password:");
        String pwd = sc.next();
        
        User user = new User(username, pwd);
        
        if (p.test(user)) {
            System.out.println("Valid user");
        } else {
            System.out.println("invalid user");
        }
    }
}



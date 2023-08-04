/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author harshit_ranawat
 */
import java.util.Scanner;
import java.sql.*;

public class Jdbc2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter UserName:  ");
            String uname=sc.nextLine();
            System.out.println("Enter Password:   ");
            String pass=sc.nextLine();
            
            PreparedStatement ps=con.prepareStatement("insert into logindetails values(?,?)");
            ps.setString(1,uname);
            ps.setString(2, pass);
           
            ps.executeUpdate();
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

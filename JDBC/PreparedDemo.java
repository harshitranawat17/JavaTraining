/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author harshit_ranawat
 */
import java.sql.*;
import java.util.*;

public class PreparedDemo {
    public static void main(String[] args) throws Exception{
        
        //1. Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2. Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
        
        //3. PreparedStatement
        
        PreparedStatement ps = con.prepareStatement("select * from Department where DEPTCODE=?");
        
        //Statement stm = con.createStatement();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deptcode: ");
        
        int dc = sc.nextInt();
        
        //set the value of "?"
        
        ps.setInt(1, dc);
        
        //4. Resultset TAble
        ResultSet rs = ps.executeQuery();
        
        
        
        while(rs.next()){
            
            System.out.println(rs.getInt("DEPTCODE"));
            System.out.println(rs.getString("DeptName")); 
            System.out.println(rs.getString("LOCATION"));  
           
            
        }
    }
}

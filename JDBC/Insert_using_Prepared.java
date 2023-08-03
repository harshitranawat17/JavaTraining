/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author harshit_ranawat
 */
import java.util.*;
import java.sql.*;
public class Insert_using_Prepared {
    
     public static void main(String[] args) throws Exception{
        //1. Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2. Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
        
        //3. Prepared Statement
        PreparedStatement ps = con.prepareStatement("insert into Department values(?,?,?)");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:  ");
       
        int dc = sc.nextInt();
        String name = sc.next();
        String loc = sc.next();
        
        ps.setInt(1, dc);
        ps.setString(2, name);
        ps.setString(3, loc);
        
        //update new entry
        ps.executeUpdate();
        
        ResultSet rs1 = ps.executeQuery("select * from Department");
        
        
        while(rs1.next()){
            
            System.out.println(rs1.getInt("DEPTCODE"));
            System.out.println(rs1.getString("DeptName")); 
            System.out.println(rs1.getString("LOCATION"));  
        }
    }
}

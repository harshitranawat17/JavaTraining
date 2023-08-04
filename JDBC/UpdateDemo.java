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
public class UpdateDemo {
    public static void main(String[] args) throws Exception{
        //1. Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2. Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
        
        //3. Statement
        Statement stm = con.createStatement();
        
        //4 update query
        stm.executeUpdate("update Department set LOCATION='sarika' where DEPTCODE=20");
        
        
        ResultSet rs = stm.executeQuery("select * from Department");
        
        int dc;
        String name;
        String loc;
        
        while(rs.next()){
            
            dc = rs.getInt("DEPTCODE");
            name = rs.getString("DeptName");
            loc = rs.getString("LOCATION");
           
            System.out.println(dc+" "+name+" "+loc);
        }
    }
}
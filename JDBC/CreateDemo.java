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
public class CreateDemo {
    public static void main(String[] args) throws Exception{
        //1. Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2. Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
        
        //3. Statement
        Statement stm = con.createStatement();
        
        //4 create table query
        stm.executeUpdate("create table Temp(a integer,b float)");
        
        stm.executeUpdate("insert into Temp values(10,67.4)");
        
        ResultSet rs = stm.executeQuery("select * from Temp");
        
        
        
        while(rs.next()){
            
            System.out.println(rs.getInt("a"));
            System.out.println(rs.getFloat("b"));
           
      
           
            
        }
    }
}

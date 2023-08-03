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
public class DropDemo {
     public static void main(String[] args) throws Exception{
        //1. Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2. Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
        
        //3. Statement
        Statement stm = con.createStatement();
        
        //4 create table query
        stm.executeUpdate("drop table Temp");
        
    }
}

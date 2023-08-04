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
public class Jdbc1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
            Statement st=con.createStatement();
            st.executeUpdate("create table logindetails(uname varchar(50) primary key,pass varchar(50));");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

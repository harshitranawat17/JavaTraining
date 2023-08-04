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

public class Jdbc3 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshit","root","root");
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter Your Uname");
            String uname=sc.nextLine();
            System.out.println("Enter Your Password");
            String pass=sc.nextLine();
            
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("select * from logindetails where uname='"+uname+"'and pass='"+pass+"'");
            
            if(rs.next()){
                System.out.println("Login Succesfull "+uname);
            }
            else{
                System.out.println("Invalid UserName");
            }
            
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

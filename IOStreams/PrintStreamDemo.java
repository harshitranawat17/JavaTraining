/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStreams;

/**
 *
 * @author harshit_ranawat
 */
import java.io.*;

class Student
{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("/home/harshit_ranawat/TempFiles/File8.txt");
        PrintStream ps=new PrintStream(fos);
        
        
        Student s=new Student();
        s.rollno=10;
        s.name="John";
        s.dept="CSE";
        
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();
        
        //.......................................................................
        /*
        FileInputStream fis = new FileInputStream("/home/harshit_ranawat/TempFiles/File7.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        
        Student s=new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        
        System.out.println("Roll no " +s.rollno);
        System.out.println("name " +s.name);
        System.out.println("dept " +s.dept);
        */
    }    
}
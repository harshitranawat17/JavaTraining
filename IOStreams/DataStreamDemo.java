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
    float avg;
    String dept;
}
public class DataStreamDemo 
{
    public static void main(String[] args)throws Exception
    {
        //writing in a file
        FileOutputStream fos=new FileOutputStream("/home/harshit_ranawat/TempFiles/Student.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        Student s1=new Student();
        
        s1.rollno=10;
        s1.name="John";
        s1.dept="CSE";
        s1.avg=75.9f;
        
        dos.writeInt(s1.rollno);
        dos.writeUTF(s1.name);  //write string using UTF
        dos.writeUTF(s1.dept);
        dos.writeFloat(s1.avg);
        
        dos.close();
        fos.close();
        
        
        //reading from file
        FileInputStream fis=new FileInputStream("Student2.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        Student s=new Student();
        
        s.rollno=dis.readInt();
        s.name=dis.readUTF();   //read string UTF
        s.dept=dis.readUTF();
        s.avg=dis.readFloat();
        
        System.out.println("Roll no "+s.rollno);
        System.out.println("Name "+s.name);
        System.out.println("Average "+s.avg);
        System.out.println("Dept "+s.dept);
        
        
        dis.close();
        fis.close();
    }
}

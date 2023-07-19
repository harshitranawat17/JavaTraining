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

class Student implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;  //cannot modify after serializtion bcz of static
    public transient int t;   //cannot modify after serializtion bcz of transient
    
    public Student()
    {
        
    }
    public Student(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    @Override
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class ObjectStreamDemo 
{
   /* public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("/home/harshit_ranawat/TempFiles/Student1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student s=new Student(10,"John",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    }
    */
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("/home/harshit_ranawat/TempFiles/Student1.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}

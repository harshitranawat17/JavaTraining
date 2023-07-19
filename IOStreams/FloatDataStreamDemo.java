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

public class FloatDataStreamDemo 
{
    public static void main(String[] args) throws Exception
    {
        float list[]={1.2f , 3.45f , 6.78f , 9.01f , 2.34f};
        
        FileOutputStream fos=new FileOutputStream("List.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        dos.writeInt(list.length); //write length of list in file as integer
        for(float f:list)
        {
            dos.writeFloat(f);  //write values of list in file 
        }
        
        dos.close();
        fos.close();
        
        //---------------------------------------------------------------------------
        
        FileInputStream fis=new FileInputStream("List.txt");
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();  //taking length of values from file
        float data;
        
        for(int i=0;i<length;i++)
        {
            data=dis.readFloat();  
            System.out.println(data);
        }
        dis.close();
        fis.close();
        
    }   
}

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
public class FileExample {
    
    public static void main(String[] args) throws Exception
    {
        /*
        try(FileReader fr = new FileReader("/home/harshit_ranawat/TempFiles/test1.txt");){
        
            int x;
            
            while((x=fr.read())!=-1){
                System.out.print((char)x);
            }
        
        
        }
        */
        
        try(FileOutputStream fos=new FileOutputStream("/home/harshit_ranawat/TempFiles/test2.txt");)
        {
        
        String str="earn Java Programming.";
        
        byte b[]=str.getBytes();
        
        /*
        //fos.write(str.getBytes());
        for(byte x:b)
            fos.write(x);*/
        //fos.write(b, 6, str.length()-6);
        
        fos.write(b);
        
        //fos.close();
        
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
}

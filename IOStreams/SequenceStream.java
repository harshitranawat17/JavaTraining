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
public class SequenceStream {
    
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("/home/harshit_ranawat/TempFiles/File1.txt");
        FileInputStream fis2=new FileInputStream("/home/harshit_ranawat/TempFiles/File2.txt");
        
        FileOutputStream fos=new FileOutputStream("/home/harshit_ranawat/TempFiles/File3.txt");
        
        //Sequence //merge both file
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)  //read from sequencefile
        {
            
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
}

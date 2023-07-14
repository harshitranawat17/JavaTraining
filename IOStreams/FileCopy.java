/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStreams;

import java.io.*;
/**
 *
 * @author harshit_ranawat
 */
public class FileCopy {
    
    public static void main(String[] args) throws Exception{
        
        try (FileInputStream fis = new FileInputStream("/home/harshit_ranawat/TempFiles/File1.txt")) {
            FileOutputStream fos = new FileOutputStream("/home/harshit_ranawat/TempFiles/output.txt");
            
//            byte b[] = new byte[fis.available()];
//        
//            
//            String str = new String(b);
//            
//            for(int i =0; i<str.length();i++)
//            {
//            
//                fos.write(str);
//            }
            
            
             int b;
             while((b=fis.read())!=-1)
             {
            
                fos.write(b);
             }
            
            
            fos.close();
        }
        
    }
    
    
}

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

public class ByteArrayInput {
    
    public static void main(String[] args) throws Exception{
        
        //byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
    
        //ByteArrayInputStream bis = new ByteArrayInputStream(b);
    
        /*
        int x;
    
        while((x=bis.read())!=-1)
        {
             System.out.print((char)x);
            
        }
        */
        
        //String str = new String(bis.readAllBytes());
        
        //System.out.print(str);
        
        //bis.close();
        
        //----------------------------------------------------------------------
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        
        bos.write('a');
        bos.write('b');
        bos.write('c');
        
        byte b[] = bos.toByteArray();
        
        for(byte x : b){
            System.out.println(x);
        }
        
        //bos.writeTo(new FileOutputStream("/home/harshit_ranawat/TempFiles/File4.txt"));
        
        bos.close();
        
    }
    
    
}

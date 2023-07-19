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
public class BufferedStream {
    public static void main(String[] args)throws Exception 
    {
        
        //FileInputStream fis = new FileInputStream("/home/harshit_ranawat/TempFiles/File5.txt");
        //BufferedInputStream bis = new BufferedInputStream(fis);
        
        FileReader fis=new FileReader("Test.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        bis.mark(10);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
        
    }    
}

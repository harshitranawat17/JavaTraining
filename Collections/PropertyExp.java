/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author harshit_ranawat
 */

import java.util.*;
import java.io.*;
public class PropertyExp  {
    public static void main(String[] args) throws Exception{
        
        
        
        //the ony difference from Hashtable is that, property store only key, value both in "strings" only.
        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
        
        p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop");
        
        
        p.load(new FileInputStream("MyData.txt"));
        
        System.out.println(p);
    }
}

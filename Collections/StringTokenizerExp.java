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

public class StringTokenizerExp {
    public static void main(String[] args) throws Exception{
        
        
        FileInputStream fis = new FileInputStream("/home/harshit_ranawat/TempFiles/File1.txt");
        
        byte[] b = new byte[fis.available()];
        fis.read(b);
        
        
        String data = new String(b);
        
        
        //it will give the seperate tokens from given string
        StringTokenizer st = new StringTokenizer(data, "-");
        
        String s;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(st.hasMoreTokens()){
            s = st.nextToken();
            arr.add(Integer.valueOf(s));
        }
        
        System.err.println(arr);
    }
}

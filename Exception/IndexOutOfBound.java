/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.util.Scanner;
/**
 *
 * @author harshit_ranawat
 */
public class IndexOutOfBound {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner (System.in);
        
            System.out.println("enter the size of array: ");
            int n= sc.nextInt();
            int arr[]= new int[n];
        
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            
            }
            System.out.println("enter the index you want value");
            int k=sc.nextInt();
        
            System.out.println("the value at index"+ k+ "is " +arr[k] );
        }
        catch(Exception e){
             System.out.println("please enter a valid index");
        }
        System.out.println("program ended");
    }
}

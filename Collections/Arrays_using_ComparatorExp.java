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

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}


public class Arrays_using_ComparatorExp {
    public static void main(String[] args) {
        
       Integer a[]={2,4,6,8,1,3,5,7};
        
        
       System.err.println(Arrays.binarySearch(a, 2));
       
        
       Arrays.sort(a);
        
       
       //by using comparator, sorting done in reverse order
       //Arrays.sort(a, new My());
       
       for(Integer x:a) 
            System.out.println(x);

    }
}

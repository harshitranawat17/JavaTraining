/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument_Bi;

/**
 *
 * @author harshit_ranawat
 */

import java.util.function.*;

class BiExp2
{
    public static void main(String[] args)
    {
        BiFunction<Integer,Integer,Integer> f=(a,b)->a*b;
        System.out.println(f.apply(10,20));
        System.out.println(f.apply(100,200));

    }
}
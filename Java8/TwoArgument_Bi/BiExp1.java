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
class BiExp1
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> p=(a,b)->(a+b) %2==0;
        System.out.println(p.test(10,20));
        System.out.println(p.test(15,20));
    }
}
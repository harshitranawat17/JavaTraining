/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** @author harshit_ranawat
 *  @version 2.0
 *  @since 2015
 **/
package Annotations_Javadoc;

/**
 * 
 * @author harshit_ranawat
 * 
 * Class for Library Book
 */


public class Bookexp
{ 
    
    /**
     * @value 10 default value
     */
    static int val=10;
    
    
    /**
     * Parametrized Constructor
     * @param s Book Name
     */
    
    public Bookexp(String s){
    }
  
    /**
     * Issue a Book to a Student
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll) throws Exception{
    }
    
    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }
    
    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){       
        return "";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Annotations_Javadoc;

/**
 *
 * @author harshit_ranawat
 */
import java.lang.annotation.*;

//@Retention(RetentionPolicy.Class)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(MyAnno.class)

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }

//@MyAnno(name="Harshit",project="Bank")
public class AnnotationsDemo1
{
    int data;
    //@MyAnno(name="Harshit",project="Bank")
    
    
    //@MyAnno(name="Harshit")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Harshit")
        int x;
    }
    
}

package JavaPrograms_61to70;

public class Problem_62_CheckStringisEmptyorNull {
	
	public static void main(String[] args) 
    {  
              
       String str1 = "Harshit"; 
       String str2 = null; 
 
       System.out.println("Is string:  " + str1 +"  empty or null? " + isEmptyOrNull(str1)); 
       System.out.println("Is string:  " + str2 + "  empty or null? "+ isEmptyOrNull(str2)); 
       
   } 
   public static boolean isEmptyOrNull(String str) 
   { 
       if (str == null) 
           return true; 
       else
           return false; 
   }    
}

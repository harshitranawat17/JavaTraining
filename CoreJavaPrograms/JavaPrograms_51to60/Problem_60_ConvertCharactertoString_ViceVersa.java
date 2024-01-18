package JavaPrograms_51to60;

public class Problem_60_ConvertCharactertoString_ViceVersa {
	
	public static void main(String[] args) {
		
        char ch = 'H';
        
        String st = Character.toString(ch);
        // Alternatively
  
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
        
        //vice versa
        String s="hello";    
        for(int i=0; i<s.length();i++){  
                char c = s.charAt(i);  
                System.out.println("char at "+i+" index is: "+c);  
        }   
    }
}

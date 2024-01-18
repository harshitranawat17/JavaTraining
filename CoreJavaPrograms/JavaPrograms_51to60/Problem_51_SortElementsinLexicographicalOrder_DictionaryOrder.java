package JavaPrograms_51to60;

public class Problem_51_SortElementsinLexicographicalOrder_DictionaryOrder {
	
	public static void main(String[] args) 
    { 
        String arr[] = { "Harshit", "Roshan", "abhigyan", "jigyasa"}; 
  
        sort(arr); 
  
        printArray(arr); 
    } 
	
	public static void sort(String strArr[]) 
    { 
        for (int i = 0; i < strArr.length; i++) { 
            for (int j = i + 1; j < strArr.length; j++) { 
                if (strArr[i].compareToIgnoreCase(strArr[j]) 
                    > 0) { 
                    String temp = strArr[i]; 
                    strArr[i] = strArr[j]; 
                    strArr[j] = temp; 
                } 
            } 
        } 
    } 
  
    public static void printArray(String strArr[]) 
    { 
        for (String string : strArr) 
            System.out.print(string + " "); 
        System.out.println(); 
    } 
}

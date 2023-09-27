package Arrays;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray(10);
		
		TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
		
		sda.insert(0, 0);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(1, 30);
		sda.insert(12, 120);

		var firstelement = sda.arr[0];
		System.out.println(firstelement);
		var thirdelement = sda.arr[2];
		System.out.println(thirdelement);
		
		System.out.println("Array tarverse: ");
		sda.traverseArray();
		
		System.out.println("search array: ");
		sda.searchInArray(10);
		
		System.out.println("delete array: ");
		sda.deleteValue(0);
		System.out.println(sda.arr[0]);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Insertion" );
		tda.insertValueInTheArray(0, 0, 10);
		System.out.println(Arrays.deepToString(tda.arr));
		
		System.out.println("Access" );
		tda.accessCell(0, 1);
		
		System.out.println("Traverse" );
		tda.traverse2DArray();
		
		System.out.println("Searching" );
		tda.searchingValue(10);
		tda.searchingValue(20);
		
		System.out.println("delete" );
		System.out.println(Arrays.deepToString(tda.arr));
		tda.deleteValuefromArray(0, 0);
		System.out.println(Arrays.deepToString(tda.arr));
		
		
	}
}

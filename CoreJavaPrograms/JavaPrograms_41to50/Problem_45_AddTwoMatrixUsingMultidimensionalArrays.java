package JavaPrograms_41to50;

public class Problem_45_AddTwoMatrixUsingMultidimensionalArrays {
	public static void main(String[] args) {
		
		int row = 2, column = 4;
        
        int[][] MatrixA = { {1, 1, 1, 1}, {2, 3, 5, 2} };
        int[][] MatrixB = { {2, 3, 4, 5}, {2, 2, 4, -4} };
        
        int[][] sum = new int[row][column];
        
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }
        //display
        System.out.println("Sum is: ");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
	}
}

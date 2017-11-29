package setup;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        
    	System.out.println("Enter Parms.");
    	
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();		// number of rows
    	int m = in.nextInt();		// number of columns
    	int r = in.nextInt();		// number of rotations
    	
    	System.out.println("Paramater Entry Complete.");
    	
    	int[][] matrix = new int[n][m];

    	// input data
    	for(int i = 0; i < n; i++){
    		
    		System.out.println("Enter data for row -> " + i);
    		
    		for(int j = 0; j < m; j++) {

    			matrix[i][j] = in.nextInt();    			
    			
    		}
    	}

    	// print data
    	System.out.println("Rows........: " + n);
    	System.out.println("Columns.....: " + m);
    	System.out.println("Rotations...: " + r);
    	
    	for(int i = 0; i < n; i++){
    		
    		for(int j = 0; j < m; j++) {

    			System.out.print(matrix[i][j]);
    			if(j != n - 1)
    				System.out.print(" ");
    			else
    				System.out.println("");
    		}
    	}
    }
}

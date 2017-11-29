package array_ds_1d;

import java.io.*;
import java.util.*;

public class Solution {

	private static void reverseArray(int n, int[] a) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			
			int index = (n - 1) - i;
			
			sb.append(String.valueOf(a[index]) + (i != n - 1 ? " " : ""));
		}

		System.out.println(sb.toString());
		
	}
	
	public static void main(String[] args) {

	   	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();		// number of array elements

    	int[] a = new int[n];

    	// input data
    	for(int i = 0; i < n; i++){
    		a[i] = in.nextInt();    			
    	}		
		reverseArray(n, a);
		
	}

}

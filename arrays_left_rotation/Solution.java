package arrays_left_rotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void rotateArray(int[] a, int k) {
	
		int n = a.length;
		int[] result = new int[n];
		int r = 0;
		int newIndex = 0;

		// determine actual rotations (r)
		if(k > n)
			r = k - (k / n) * n;
		else
			r = k;
		
		// iterate thru array, reassigning index
		for(int i = 0; i < n; i++) {
			if(i - r < 0) 
				newIndex = n - Math.abs(i - r);
			else
				newIndex = i - r;
			
			result[newIndex] = a[i];
		}

		// print results
		for(int i = 0; i < n; i++) {
			System.out.print(result[i] + (i != n - 1 ? " " : ""));
		}
		
	}
	
    public static void main(String[] args) {
        int n = 5;
        int k = 4;
        int a[] = {1, 2, 3, 4, 5};
        
        rotateArray(a, k);
     }
}
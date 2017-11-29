package birthday_cake;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        
    	int height = ar[0];
    	int count = 0;
    	
    	for(int i = 0; i < n; i++) {

    		if(ar[i] > height) {
    			height = ar[i];
    			count = 1;
    		}
    		else if(ar[i] == height)
    			count++;
    		
    	}
    	return count;
    	
    }

    public static void main(String[] args) {
 
        int n = 4;
        int[] ar = {3,2,1,3};
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

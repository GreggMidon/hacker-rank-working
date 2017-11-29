package mini_max_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static long[] solve(int[] numberList) {
		
		long sum = 0;
		long maxValue = 0;
		long minValue = Long.MAX_VALUE;
		int skipNum = 0;
		
		for(int i = 0; i < numberList.length; i++) {
			
			sum = 0;
			for(int j = 0; j < numberList.length; j++) {
			
				if(j != skipNum) {
					sum += numberList[j];
				}
			}
			
			if(sum > maxValue) maxValue = sum;
			
			if(sum < minValue) minValue = sum;
			
			skipNum++;
		}
		
		return new long[] {minValue, maxValue};
	}
	
    public static void main(String[] args) {

    	int[] arr = {1,2,3,4,5};
    	
    	long[] result = solve(arr);

    	System.out.println(result[0] + " " + result[1]);
    	
    }
}
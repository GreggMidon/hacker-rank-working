package quicksort_partition;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] quickSort(int[] arr) {

    	int arrLen = arr.length;
    	int[] result = new int[arrLen];
    	int[] left = new int[arrLen - 1];
    	int[] right = new int[arrLen - 1];
    	int[] equal = new int[arrLen];
    	
    	int ln = 0;
    	int rn = 0;
    	int en = 0;
    	
    	int pivot = arr[0];
    	
    	for(int i = 0; i < arrLen; i++) {
    		
    		if(arr[i] == pivot) {
    			equal[en] = arr[i];
    			en++;
    		}
    		else if(arr[i] < pivot) {
    			left[ln] = arr[i];
    			ln++;
    		}
    		else if(arr[i] > pivot) {
    			right[rn] = arr[i];
    			rn++;
    		}
    	}
   	
    	int n = 0;
   
    	for(int i = 0; i < ln; i++) {
    		result[n] = left[i];
    		n++;
    	}
    	
    	for(int i = 0; i < en; i++) {
    		result[n] = equal[i];
    		n++;
    	}
    	
    	for(int i = 0; i < rn; i++) {
    		result[n] = right[i];
    		n++;
    	}
   	
        return result;
    }

    public static void main(String[] args) {

    	int[] arr = {4, 5, 3, 7, 2};
        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

    }
}

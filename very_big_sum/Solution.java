package very_big_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long aVeryBigSum(int n, long[] ar) {
    	
    	long sum = 0;
    	for(long g: ar) {
    		sum += g;
    	}
    	return sum;
    }

    public static void main(String[] args) {

    	int n = 7;
    	
    	long[] ar = {2,8,1,4,4,8,1};
    	
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
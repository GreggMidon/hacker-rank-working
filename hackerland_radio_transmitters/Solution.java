package hackerland_radio_transmitters;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int hackerlandRadioTransmitters(int[] x, int k) {

    	boolean done = false;
    	int n = x.length;
    	int[] stations = new int[n];
    	int stationCount = 0;
    	int end = n;
    	
    	while (!done) {
    		
    		// place station at correct position
    		int pos = end - k;
    		
    		// if position is still on the line
    		if(pos > 0) {
    			stations[stationCount] = pos;
    			end = pos - k;
    			stationCount++;
    		}
    		else {
    			done = true;
    		};
    		
    	}
    	return 0;
    }

    public static void main(String[] args) {

        int k = 1;
        int[] x = {1, 2, 3, 4, 5};
        
        int result = hackerlandRadioTransmitters(x, k);

        System.out.println(result);

    }
}
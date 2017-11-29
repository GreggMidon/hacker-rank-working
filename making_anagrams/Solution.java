package making_anagrams;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static int numberNeeded(String first, String second) {

    	/*  Basic Approach: 
    	    Create two "frequency" tables, one for each argument String.  The table is a hash map, the 
    	    keys of which are the lower case characters in the Strings, and the value
    	    is the number of occurrences of the letter.  The frequency differences
    	    between the two hash maps should be the count of deletions. 

    	 */
    	int needed = 0;
    	
    	Map<String, Integer> firstMap = new HashMap<>();
    	
    	// populate first map
    	int firstLen = 0;
    	if(!first.isEmpty()) {
    		firstLen = first.length();
    		for(int i = 0; i < firstLen; i++) {
    			String s = first.substring(i, i + 1);
    			Integer freq = firstMap.get(s);
    			firstMap.put(s, (freq == null)? 1: freq + 1);
    		}
    	}
    	
    	Map<String, Integer> secondMap = new HashMap<>();
    	
    	// populate second map
    	int secondLen = 0;
    	if(!second.isEmpty()) {
    		secondLen = second.length();
    		for(int i = 0; i < secondLen; i++) {
    			String s = second.substring(i, i + 1);
    			Integer freq = secondMap.get(s);
    			secondMap.put(s, (freq == null)? 1: freq + 1);
    		}
    	}    	
    	
    	// compare first map's keys to second
    	Integer freq1;
    	Integer freq2;
    	
    	for(String s: firstMap.keySet()) {
    		
    		freq1 = freq2 = 0;
    		
    		freq1 = firstMap.get(s);
    		if(secondMap.containsKey(s)) {
    			freq2 = secondMap.get(s);
    		}
    		
    		needed += (freq1 > freq2)? freq1 - freq2: freq2 - freq1;
    	}
    	
    	// need to find keys in second map that are not in the first
    	for(String s: secondMap.keySet()) {

    		freq2 = 0;
    		
    		if(!firstMap.containsKey(s)) {
    			freq2 = secondMap.get(s);
    		}
    		
    		needed += freq2;
    	}    	

    	return needed;
    }
  
    public static void main(String[] args) {
        
        String a = "cde";
        String b = "abc";
        
        System.out.println(numberNeeded(a, b));
    }
}
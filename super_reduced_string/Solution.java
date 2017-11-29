package super_reduced_string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    static String super_reduced_string(String s){

    	if(s.isEmpty()) return "";
    	if(s.length() == 2 && s.charAt(0) == s.charAt(1)) return "";
    	
    	char[] chars = s.toCharArray();
    	char[] result = new char[s.length()];
    	char prevChar = s.charAt(0);
    	int counter = 0;
    	int len = s.length();
    	
    	while(true) {

    		for(int i = 1; i < len; i++) {
    	
    			if(s.charAt(i) == prevChar) {
    				chars[i - 1] = 0;
    				chars[i] = 0;
    			}
    			else {
    				if(prevChar != 0) {
    					result[counter] = prevChar;
    					counter++;
    				}
    			}
    			prevChar = chars[i];
    		}
    	
    		// handle last character
    		if(prevChar != 0) 
    			result[counter] = prevChar;
    		else
    			counter--;
    		
    		chars = new char[counter + 1];
    		int index = 0;
    		for(char c: result) {
    			if(c != 0) {
    				chars[index] = c;
    				index++;
    			}
    		}
    		
    		if(index == 0)
    			return "";
    		
    		else if(chars.length == len) 
    			return new String(chars);
    	
    		else {
    			len = chars.length;
    			result = new char[len];
    			counter = 0;
    			prevChar = chars[0];
    			s = new String(chars);
    		}
    	}
    }

    public static void main(String[] args) {
        
        String result = super_reduced_string("kagoyzkgfjnyvjewazalxngpdcfahneqoqgiyjgpzobhaghmgzmnwcmeykqzgajlmuerhhsanpdtmrzibswswzjjbjqytgfewiuu");
        System.out.println(result);
    }

}

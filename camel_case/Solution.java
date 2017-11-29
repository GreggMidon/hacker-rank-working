package camel_case;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	
	public static int countWords(String s) {

		char[] ca = s.toCharArray();
		int wordCount = 0;
		
		for(char c: ca) {
			if (Character.getType(c) == Character.UPPERCASE_LETTER) {
				wordCount++;
			}
		}
		return wordCount + 1;
	}

    public static void main(String[] args) {
        
    	String s = "saveChangesInTheEditor";
    	System.out.println(countWords(s));
    	
    	
    	
    }
}
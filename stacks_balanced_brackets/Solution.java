package stacks_balanced_brackets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	private static boolean isLeftType(char c) {
		
		if(c == '(' || c == '[' || c == '{') return true;
		return false;
			
	}
	
	private static char getLeftPartnerMatch(char c) {
		
		if(c == ')')
			return '(';
		
		else if(c == ']')
			return '[';
		
		else if(c == '}')
			return '{';
		
		else
			return 0;
		
	}
	
    public static boolean isBalanced(String expression) {
        
    	char[] enclosures = expression.toCharArray();
    	int n = enclosures.length;
    	char[] stack = new char[n];
    	int index = 0;
    	
    	// traverse "expression" char by char
    	for(int i = 0; i < n; i++) {

    		char ch = enclosures[i];
    		if(isLeftType(ch)) {
    			
    			// add enclosure to stack
    			stack[index] = ch;
    			index++;
    		}
    		else {
    			
    			// empty stack, right type not allowed
    			if(index == 0)
    				return false;
    			
    			else {
    				// determine if left enclosure matches right
    				if(stack[index - 1] == getLeftPartnerMatch(ch)) { 
    					// remove partners from stack
    					index -= 1;
    				}
    				else
    					return false;
    			}
    		}
    	}
    	
    	if(index == 0)
    		return true;
    	
    	return false;
    }
    
    public static void main(String[] args) {

        String[] expressionList = {"{[()]}", "{[(])}", "{{[[(())]]}}"};
        
        for(String expression: expressionList) {
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

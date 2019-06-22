package java_data_types;
import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh) {

    	long x = Long.valueOf("-100000000000000");
        	
        try {
        	System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte");
            if(x>=-32768 && x<=32767)System.out.println("* short");
            if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
            if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
        }
        catch(Exception e) {
                System.out.println(" can't be fitted anywhere.");
        }
    }
}

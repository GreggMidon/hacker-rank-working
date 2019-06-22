package stat_init_blk;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// code goes here
	static Scanner in = new Scanner(System.in);
	static boolean flag = false;
	static int B = 0;
	static int H = 0;
	
	static {
		//B  = in.nextInt();
		//H = in.nextInt();
		B = -1;
		H = 3;
			
		if(B > 0 && H > 0) {
			flag = true;
		}
		else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	} //end of main

} //end of class

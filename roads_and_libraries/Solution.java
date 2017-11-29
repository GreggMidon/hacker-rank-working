package roads_and_libraries;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static void calculateRepairCost(int n, int m, long clib, long crep, int[][] roads) {
		
		
		
		
		
		
		class Node {
			String name;
			long cost = 0;
			List<Node> adjNodes = new ArrayList<>();
			List<Pair> edges = new ArrayList<>();
			
			class Pair {
				int left = 0;	// connected Node name
				int right = 0;	// cost of edge
				
				int getLeft() {
					return left;
				}
				
				int getRight() {
					return right;
				}
				
				void setLeft(int left) {
					this.left=left;
				}
				
				void setRight(int right) {
					this.right = right;
				}
			}
		}
	}
	
    public static void main(String[] args) {

    	/*
    		3 3 2 1
			1 2
			3 1
			2 3
    	*/
        int n = 3;		// cities
        int m = 3;		// roads
        long x = 2;		// cost of libray
        long y = 1;		// cost to repair road
        int[][] roads = {{1,2},{3,1},{2,3}};

    }
}


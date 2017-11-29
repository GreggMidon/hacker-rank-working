package matrix_rotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	private static void rotateMatrix(int rows, int cols, int rotations, int[][] matrix) {
		
		int[][] finalMatrix = new int[rows][cols];
		int levels = 0;
		int dimX = rows;
		int dimY = cols;
		int n;
		int m;
		int r;
		int c;
		int fullRotation;
		int actualRotations;
		int newIndex;
		int offset = 1;
		String[] path;
		Map<String, Node> map;
		
		// determine level count min(r,c) % 2 = 0
		if(rows <= cols && rows % 2 == 0) {
			levels = rows / 2;
		}
		else if(rows > cols && cols % 2 == 0) {
			levels = cols / 2;
		}
		else {
			throw new RuntimeException("Invalid matrix dimensions!");
		}
	
		while(levels > 0) {
		
			// calculate new (rotated) positions
			n = dimX;
			m = dimY;
			fullRotation = n + m + (n - 2) + (m - 2);
			actualRotations = 0;
			newIndex = 0;
			
			path = new String[fullRotation];		// path of current loop
			map = new HashMap<>();					// map of path & index	
		
			// determine actual rotations
			if(rotations > fullRotation)
				actualRotations = rotations - (rotations / fullRotation) * fullRotation;
			else
				actualRotations = rotations;
			
			r = c = 1;		// upper-right corner
			
			for(int i = 0; i < fullRotation; i++) {
			
				path[i] = String.valueOf(r) + "," + String.valueOf(c);
				
				int data = matrix[r - offset][c - offset];

				if(c == 1 && r < n)
					r += 1;

				else if(r == n && c < m)
					c += 1;
			
				else if(c == m && r > 1) 
					r -= 1;
			
				else if(r == 1 && c > 1)
					c -= 1;
			
				else
					throw new RuntimeException("Code/Data inconsistency!");
				
				// determine new index (after all rotations)
				newIndex = i + actualRotations;
				if(newIndex > fullRotation - 1) 
					newIndex = newIndex - fullRotation;
			
				map.put(path[i], new Solution.Node(path[i], data, newIndex));
				
			}

			// update the final matrix with new data positions
			for(int j = 0; j < fullRotation; j++) {

				// retrieve key for current path item
				String thisKey = path[j];

				// retrieve the data from the map using this key
				Solution.Node payLoad = map.get(thisKey);
			
				// get the new path index (rotated)
				int index = payLoad.getNewIndex();
			
				// get the key for the new index and parse into row/column
				String[] coords = path[index].split(",");
				int newRow = Integer.valueOf(coords[0]);
				int newCol = Integer.valueOf(coords[1]);
			
				// populate final matrix, putting data into the new coordinates
				finalMatrix[newRow - offset][newCol - offset] = payLoad.getData();
			}

			// reset for next iteration
			dimX -= 2;
			dimY -= 2;
			levels -= 1;
			offset -= 1;
		}
		
		// output final results
		for(int s = 0; s < rows; s++) {
			for(int t = 0; t < cols; t++) {
				System.out.print(finalMatrix[s][t]);
				if(t != cols - 1)
					System.out.print(" ");
				else
					System.out.println("");
			}
		}
	}

	private static class Node {
		//private int row = 0;
		//private int col = 0;
		private int newIndex = 0;
		private int data = 0;
		
		public Node(String key, int data, int newIndex) {
			this.newIndex = newIndex;
			this.data = data;
			
			//String[] parts = key.split(",");
			//this.row = Integer.valueOf(parts[0]);
			//this.col = Integer.valueOf(parts[1]);
		}
		
		public int getNewIndex() {
			return newIndex;
		}

		public int getData() {
			return data;
		}
	}
	
    public static void main(String[] args) {
        
    	/*  IN:
				5 4 7
				1 2 3 4
				7 8 9 10
				13 14 15 16
				19 20 21 22
				25 26 27 28
			
			OUT:
				28 27 26 25
				22 9 15 19
				16 8 21 13
				10 14 20 7
				4 3 2 1
		*/
    	
    	int N = 5;
    	int M = 4;
    	int rotations = 7;
    	int[][] matrix = { {1,2,3,4},
    					   {7,8,9,10},
    					   {13,14,15,16},
    					   {19,20,21,22},
    					   {25,26,27,28}
    					 };
    	
    	rotateMatrix(N, M, rotations, matrix);
    }
}
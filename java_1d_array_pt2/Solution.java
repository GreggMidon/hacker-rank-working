package java_1d_array_pt2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public static boolean canWin(int leap, int[] game) {

		boolean done = false;
		
		int i = 0;				// i = index
		while(!done) {

			int n = game.length;
			boolean changed = false;
			
			// evaluate moves -------------------------------------------------------
			// move backward:
			// if cell i - 1 exists and contains a 0, you can walk back to cell i - 1
			// move forward:
			// If cell i + 1 contains a 0, you can walk to cell i + 1
			// If cell i + leap contains a 0, you can jump to cell i + leap
			// If you're standing in cell n - 1 or the value of i + leap >= n, you can walk or jump off the end of the array and win the game
			// In other words, you can move from index i to index i + 1, i - 1, or i + leap 
			// as long as the destination index is a cell containing a 0. 
			// If the destination index is greater than n - 1, you win the game.
			// ----------------------------------------------------------------------
			
			
			if(i > n - 1 || i == n - 1) {				// condition met for a win
				return true;
			}

			if(i + leap < n) {
				if(game[i + leap] == 0) {				// leap forward
					i += leap;
					changed = true;
				}
			}
			else {
				return true;
			}

			if(i + 1 < n && !changed) {					// step forward
				if(game[i + 1] == 0) {
					i++;
					changed = true;
				}
			}
			
			if(i - 1 >= 0 && !changed) {				// move backwards
				if(game[i - 1] == 0) {
					i--;
					changed = true;
				}
			}

			if(!changed) {								// no moves available
				return false;
			}
		}
		return false;
    }

	public static void main(String[] args) {

		int q = 4;
		List<int[]> games = new ArrayList<>();

		games.add(new int[] {0,0,0,0,0});
		games.add(new int[] {0,0,0,1,1,1});
		games.add(new int[] {0,0,1,1,1,0});
		games.add(new int[] {0,1,0});
		
		int[] leaps = {3, 5, 3, 1};
			
		for(int i = 0; i < q; i++) {
			System.out.println((canWin(leaps[i], games.get(i))) ? "YES" : "NO");
		}
	}
	
	static void print(String s) {
		System.out.println(s);
	}
	
}

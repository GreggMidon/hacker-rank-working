package java_1d_array_pt2;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	
    public static boolean canWin(int leap, int[] game) {

		int n = game.length;
		boolean[] accessible = new boolean[n];
		accessible[0] = true;
		
		for(int i = 0; i < n; i++) {
		
			if(game[i] == 0) {
			
				// condition met for a win
				if(i > n - 1 || i == n - 1) {
					return true;
				}

				// can you get to this spot by stepping forward?
				if(i - 1 > 0 && accessible[i - 1]) {
					accessible[i] = true;
				}
				// can you get to this spot by leaping forward?
				else if(i - leap > 0 && accessible[i - leap]) {
					accessible[i] = true;
				}
				// can you get to this spot by moving backwards?
				else if(i + 1 < n && game[i + 1] == 0) {
					accessible[i] = true;
				}
			}
			else {
				accessible[i] = false;
			}
		}
		return false;
    }

	public static void main(String[] args) {

		int[] games = {0,0,1,1,1,0};
		int leap = 3;
			
		System.out.println(canWin(leap, games) ? "YES" : "NO");
	}
	
	static void print(String s) {
		System.out.println(s);
	}
	
}

package array_ds_2d;

public class Solution {

	private static void findHourGlasses(int[][] a) {

		int maxVal = -63; 
		
		for(int i = 0; i < 4; i++) {

			for(int j = 0; j < 4; j++) {

				// hourglass check
				if(a[i][j] !=0 && a[i][j + 1] != 0 && a[i][j + 2] != 0 && a[i + 1][j + 1] != 0 && a[i + 2][j] != 0 && a[i + 2][j + 1] != 0 && a[i + 2][j + 2] != 0) {
				
					int val = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
					
					System.out.println(val);
				
					if(val > maxVal) 
						maxVal = val;
				}
			}
		}
		System.out.println(maxVal);
		
	}
	
	public static void main(String[] args) {
		
		int[][] array = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 9, 2, -4, -4, 0},
				{0, 0, 0, -2, 0, 0},
				{0, 0, -1, -2, -4, 0}
		};
		
		findHourGlasses(array);
	}
}

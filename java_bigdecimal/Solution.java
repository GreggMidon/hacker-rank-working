package java_bigdecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	private static void sortAndPrint(String[] a, int n) {

		List<BigDecimal> decimals = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			decimals.add(new BigDecimal(a[i]));
		}
		
		Collections.sort(decimals);
		
		for(int i = 0; i < n; i++) {
			System.out.println(decimals.get(i).toString());
		}
		
		
	}
	
	public static void main(String[] args) {

		int n = 9;
		
		String[] input = {
			"-100",
			"50",
			"0",
			"56.6",
			"90",
			"0.12",
			".12",
			"02.34",
			"000.000"
		};
		
		sortAndPrint(input, n);
		

	}

}

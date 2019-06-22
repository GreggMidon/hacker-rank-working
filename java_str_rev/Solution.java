package java_str_rev;

public class Solution {

	public static void main(String[] args) {

		//String A = "m123qwead1aewq321m";
		String A = "m112m";
		
		StringBuilder forward = new StringBuilder(A);
		System.out.println("Forward -> " + forward.toString());
		
		StringBuilder reverse = forward.reverse();
		System.out.println("Reverse -> " + reverse.toString());
		
		if(forward.toString().compareTo(reverse.toString()) == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

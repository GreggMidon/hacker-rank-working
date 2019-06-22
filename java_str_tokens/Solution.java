package java_str_tokens;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		String s = "He is a very very good boy, isn't he?";
		
		String[] tokens = s.split("[ !,?._'@]");
		
		List<String> tokenList = new ArrayList<>();
		
		for(String token: tokens) {
			if(!token.isEmpty()) {
				tokenList.add(token);
			}
		}
		
		System.out.println(tokenList.size());
		
		for(String token: tokenList) {
			System.out.println(token);
		}
	}
}

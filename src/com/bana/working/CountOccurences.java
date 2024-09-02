package com.bana.working;

import java.util.HashMap;
import java.util.Map;

/*
 * Program to count number of occurrences of each character in a string
 */
public class CountOccurences {

	public static void main(String[] args) {
		String str = "VivekisGoodBoyhome".toLowerCase();
		
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> mappedToCh = new HashMap<>();
		
		for(char c:ch) {
			mappedToCh.put(c, mappedToCh.getOrDefault(c, 0)+1);
		}
		//System.out.println(mappedToCh);
		for(Map.Entry<Character, Integer> entry:mappedToCh.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}

package com.bana.working;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given An Array of Strings strs,group the anagrams together.
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 */

public class AnagramListOfList {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> anagramList = groupAngrams(strs);
		System.out.println(anagramList);

	}

	private static List<List<String>> groupAngrams(String[] strs) {
		return Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> {
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }))
                .values()
                .stream()
                .collect(Collectors.toList());
	}

}

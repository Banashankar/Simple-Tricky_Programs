package com.bana.working;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Create a Stream pipeline to group a list of strings by their length.
 */
public class GroupStringsLength {

	public static void main(String[] args) {
		List<String> listStrs = Arrays.asList("apple","oranges","pineapple","guva","fig","custurdApple","date","cherry");
		
		//grouping strings based on their length using map
		Map<Integer, List<String>> groupedByLength = listStrs.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupedByLength);

	}

}

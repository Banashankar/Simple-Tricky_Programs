package com.bana.working;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a String write a program to find the every possible combinations
 */
public class PermutationAndCombination {

	public static void main(String[] args) {
//		
//		String input = "abc";
//		Set<String> permutations = generatePermutation(input);
//		System.out.println("Number of Permutations: " + permutations.size());
//		System.out.println("Permutations:");
//		
//		for(String str:permutations) {
//			System.out.println(str);
//		}
//	}
//
//	private static Set<String> generatePermutation(String str) {
//		Set<String> permutations = new HashSet<>();
//		if(str == null || str.length() == 0) {
//			permutations.add("");
//		return permutations;
//		}
//		char first = str.charAt(0);
//		String remaining = str.substring(1);
//		Set<String> words = generatePermutation(remaining);
//		for(String word : words) {
//			for(int i=0;i<=word.length();i++) {
//			permutations.add(insertCharAt(word,first,i));
//			}
//		}
//		return permutations;
//	}
//
//	private static String insertCharAt(String word, char c, int i) {
//		String start = word.substring(0, i);
//		String end = word.substring(i);
//		return start + c + end;
//	}
		String str = "abc";
        System.out.println("Combinations:");
        generateCombinations(str);
        System.out.println("\nPermutations:");
        printPermutations(str, "");
    }

    public static void generateCombinations(String str) {
        generateCombinations(str, "");
    }

    private static void generateCombinations(String remaining, String current) {
        if (remaining.isEmpty()) {
            System.out.println(current);
        } else {
            generateCombinations(remaining.substring(1), current + remaining.charAt(0));
            generateCombinations(remaining.substring(1), current);
        }
    }

    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ros, ans + ch);
        }
    }

}

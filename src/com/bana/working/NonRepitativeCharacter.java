package com.bana.working;

import java.util.HashSet;
import java.util.Set;

/*
 * Program to find non-repitative character in a string 
 */
public class NonRepitativeCharacter {

	public static void main(String[] args) {
		String str = "Banashankars";
		//String s = "helloworldhello";
//		String unique = "";
//		
//		for(int i=0;i<str.length();i++) {
//			char currentChar = str.charAt(i);
//			
//			if(Character.isLetter(currentChar)) {
//				
//				char charctersChar = Character.toLowerCase(currentChar);
//				
//				if(!containsUnique(unique,charctersChar)) {
//					unique = unique + charctersChar;
//				}
//			}
//			 
//		}
		
		
		//char[] chars = str.toLowerCase().toCharArray();
		
		Set<Character> unique = new HashSet<>();
		
		for(char c:str.toCharArray()) {
			if(Character.isLetter(c)) {
				char letter = Character.toLowerCase(c);
				if(!unique.contains(letter)) {
					//System.out.println(c +"");
					unique.add(letter);
				}
			}
		}
		System.out.println("Unique characters: " + unique);

	}

//	private static boolean containsUnique(String str, char c) {
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i) == c) {
//				return true;
//			}
//		}
//		return false;
//	}

}

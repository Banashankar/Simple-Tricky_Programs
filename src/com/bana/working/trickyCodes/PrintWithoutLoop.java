package com.bana.working.trickyCodes;

/*
 * Print all numbers between 1 and 100 without using any loop.
 */
public class PrintWithoutLoop {

	public static void main(String[] args) {
		int n =1;
		printNumbers(n);
	}

	private static void printNumbers(int n) {
		if(n<=100) {
			System.out.println(n);
			printNumbers(n+1);
		}
		
	}

}

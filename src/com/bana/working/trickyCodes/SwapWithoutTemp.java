package com.bana.working.trickyCodes;

/*
 * Swap two variables without using a third variable.
 */
public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 20;
		int b = 34;
		System.out.println("Before swap a & b are: "+ a + " : "+ b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swap a & b are: "+ a + " : " + b);

	}

}

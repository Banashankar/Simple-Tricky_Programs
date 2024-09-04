package com.bana.working.trickyCodes;

/*
 * Find if a number is even or odd without using any conditional operator.
 */
public class OddREvenWithout {

	public static void main(String[] args) {
		int num = 23;
		
		if((num/2)*2 == num) {
			System.out.println("Number is even: "+num);
		}
		else {
			System.out.println("Number is odd: "+num);
		}
	} 

}

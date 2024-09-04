package com.bana.working.trickyCodes;

/*
 * Add two numbers without using the addition(+) and subtraction(-) operators.
 */
public class AddWithoutPlusSub {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		
		while(y!=0) {
			x++;
			y--;
		}
		System.out.println(x);
//		int sum = add(x,y);
//		System.out.println("Sum of "+ x +" & "+ y + " is:" +sum);
	}

//	private static int add(int a, int b) {
//		if(b == 0) {
//			return a;
//		}
//		int sum = a ^ b;
//		int carry = (a & b) << 1;
//		
//		return add(sum, carry);
//	}

}


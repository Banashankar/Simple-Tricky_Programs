package com.bana.daily2Prog;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array of integers arr, return the number of sub arrays with an odd sum.
 * Ex: input: arr = [1,3,5]
 * output: 4
 */
public class NumberOfSubArraysWithOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5};

		System.out.println(countOddSumSubArr(arr));
	}

	private static int countOddSumSubArr(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum = sum + arr[j];
				if(sum % 2 !=0) {
					count++;
				}
			}
		}
		return count;
	}

}

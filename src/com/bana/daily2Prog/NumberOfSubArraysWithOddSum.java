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

		int result = countOddSumSubArr(arr);
		System.out.println("Count of subbArrays with odd sums: " + result);
	}

	private static int countOddSumSubArr(int[] arr) {
		List<List<Integer>> subArrays = new ArrayList<>();
		List<Integer> subArraySums = new ArrayList<>();
		List<Integer> oddSums = new ArrayList<>();
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum = sum + arr[j];
				//Collecting subArrays
				List<Integer> subarray = new ArrayList<>();
				for(int k=i;k<=j;k++) {
					subarray.add(arr[k]);
				}
				subArrays.add(subarray);
				subArraySums.add(sum);
				if(sum % 2 !=0) {
					oddSums.add(sum);
					count++;
				}
			}
		}
		System.out.println("All subArrays: " + subArrays);
		System.out.println("All subArray Sums: " + subArraySums);
		System.out.println("Odd sums: " + oddSums);
		return count;
	}

}

package com.bana.daily2Prog;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array with 3 * 3 matrix find the total sum of diagonal values.
 * Condition: Element repeated or used already in summing one diagonal and same value is came up while summing second diagonal So, then that value cannot be used again for summing up the diagonal.
 */

public class ThreeCrossThreeMatrix {
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int totalSum = sumDiagonal(matrix);
		System.out.println("Total sum of diagonal values: "+ totalSum);

	}

	private static int sumDiagonal(int[][] matrix) {
		
		int n = matrix.length;
		Set<Integer> usedValues = new HashSet<>();
		int sum = 0;
		
		
		//first daigonal	
		for(int i=0;i<n;i++) {
			int value = matrix[i][i];
			if(!usedValues.contains(value)) {
				sum = sum + value;
				usedValues.add(value);
			}
		}
		//second diagonal
		for(int i=0;i<n;i++) {
			int value = matrix[i][n-1-i];
			if(!usedValues.contains(value)) {
				sum = sum +  value;
				usedValues.add(value);
			}
		}
		return sum;
	}

}

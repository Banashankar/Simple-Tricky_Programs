package com.bana.working;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Find the longest sub array in a given array.
 * Find the longest subarray with a sum less than or equal to a given target:
 * Maximum size subarray with a given sum constraint:
 * Longest window with a sum constraint:
 * Subarray with maximum length and sum constraint
 * Find all longest subarrays with a sum constraint:
 */
public class LongestsubArraySlidingWindow {

	public static void main(String[] args) {
		int[] integers = {5,7,2,8};
		longestWindow(integers);

	}
	static void longestWindow(int[] nums) {
		int max = 0;
		List<int[]> windows = new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			int windowSum = 0;
			
			for(int j=i;j<nums.length;j++) {
				windowSum = windowSum + nums[j];
				if(windowSum <= 10) {
					if(j-i+1 > max) {
						max = j - i + 1;
						windows.clear();
						windows.add(Arrays.copyOfRange(nums, i, j+1));
					}
					else if(j-i+1 == max) {
						windows.add(Arrays.copyOfRange(nums, i, j+1));
					}
				}
				else {
					break;
				}
			}
		}
		  System.out.println("Length of longest window: " + max);
	        System.out.println("Longest windows: ");
	        for (int[] window : windows) {
	            System.out.println(Arrays.toString(window));
	        }
		
	}

}
/*
 * int longestWindow(int[] nums) {
    int max = 0; // Initialize max to store the longest window size
    int left = 0; // Left pointer of the window
    int windowSum = 0; // Sum of elements in the current window

    for (int right = 0; right < nums.length; right++) {
        // Add the current element to the window sum
        windowSum += nums[right];

        // Shrink the window from the left if the sum exceeds 10
        while (windowSum > 10) {
            windowSum -= nums[left];
            left++; // Move the left pointer to the right
        }

        // Update the max window size
        max = Math.max(max, right - left + 1);
    }

    return max;
}
------------------------------------------
public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 8};
        int[][] longestSubarrays = longestWindow(nums);
        for (int[] subarray : longestSubarrays) {
            System.out.println("Longest subarray: " + java.util.Arrays.toString(subarray));
        }
    }

    public static int[][] longestWindow(int[] nums) {
        int max = 0; // Initialize max to store the longest window size
        int left = 0; // Left pointer of the window
        int windowSum = 0; // Sum of elements in the current window
        List<int[]> longestSubarrays = new ArrayList<>(); // Initialize list to store longest subarrays

        for (int right = 0; right < nums.length; right++) {
            // Add the current element to the window sum
            windowSum += nums[right];

            // Shrink the window from the left if the sum exceeds 10
            while (windowSum > 10) {
                windowSum -= nums[left];
                left++; // Move the left pointer to the right
            }

            // Update the max window size and longest subarrays
            if (right - left + 1 > max) {
                max = right - left + 1;
                longestSubarrays.clear();
                longestSubarrays.add(java.util.Arrays.copyOfRange(nums, left, right + 1));
            } else if (right - left + 1 == max) {
                longestSubarrays.add(java.util.Arrays.copyOfRange(nums, left, right + 1));
            }
        }

        return longestSubarrays.toArray(new int[0][]);
    }
}
 */

package com.bana.daily2Prog;

/*
 * Find the Target in infinite sorted array 
 * For ex: target is 14, arr[1,2,3,4,5,6,7,8,9,10,11,12,13,14,......]
 */
public class TargetInInfiniteSortedArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int target = 14;
        System.out.println(findTargetInInfiniteArray(arr, target));
    }

    // Function to find the position of the target in an infinite sorted array
    private static int findTargetInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the search range until the target is within the range
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Perform binary search within the determined range
        return binarySearch(arr, target, start, Math.min(end, arr.length - 1));
    }

    // Binary search function
    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If target is not found
        return -1;
    }
}


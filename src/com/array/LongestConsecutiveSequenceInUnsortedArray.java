package com.array;

import java.util.Arrays;

public class LongestConsecutiveSequenceInUnsortedArray {

	private static boolean arrayContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
	
	public static int longestConsecutive(int[] nums) {
        int longestStreak = 0;

        for (int num : nums) {
            int currentNum = num;
            int currentStreak = 1;

            while (arrayContains(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }
	
	public static void main(String[] args) {

		int arr[] = {100, 4, 200, 1, 3, 2};
		//System.out.println(LongestConsecutiveSequenceInUnsortedArray.longestConsecutive(arr));
		System.out.println(LongestConsecutiveSequenceInUnsortedArray.longestConsecutive1(arr));
	}
	
	 public static int longestConsecutive1(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }

	        Arrays.sort(nums);

	        int longestStreak = 1;
	        int currentStreak = 1;

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i-1]) {
	                if (nums[i] == nums[i-1]+1) {
	                    currentStreak += 1;
	                }
	                else {
	                    longestStreak = Math.max(longestStreak, currentStreak);
	                    currentStreak = 1;
	                }
	            }
	        }

	        return Math.max(longestStreak, currentStreak);
	    }

}

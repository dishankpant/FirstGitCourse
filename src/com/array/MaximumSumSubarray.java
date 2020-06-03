package com.array;

public class MaximumSumSubarray {

	public static void main(String[] args) {

		int [] array = {1,4,-2};
		System.out.println(maxArraySum(array, array.length));
	}

	private static int maxArraySum(int[] array, int n) {

		int ans = Integer.MIN_VALUE;
		for(int start_index = 0;start_index < n; ++start_index)					//O(n)		
		{
			int sum = 0;
			for(int sub_array_size = 1;sub_array_size <= n; ++sub_array_size)	//O(n)	
			{
				if(start_index+sub_array_size > n)	//Subarray exceeds array bounds
					break;
				sum+= array[start_index + sub_array_size - 1];	//Last element of the new Subarray
				ans = Math.max(ans,sum);
			}
		}
		return ans;
	}

}

package com.dynamicprogramming;

import java.util.Stack;

public class ZeroOneKnapsackUsingDP {

	public static void main(String[] args) {

		int[] profit = { 60, 100, 120 };
		int[] weight = { 10, 20, 30 };
		int capacity = 50;
		System.out.println(maximizeProfit(profit, weight, capacity));
		
		Stack<Integer> stack = new Stack<Integer>();
	}

	private static int maximizeProfit(int[] profit, int[] weight, int capacity) {
		return auxMaximizeProfit(profit, weight, capacity, 0);
	}

	private static int auxMaximizeProfit(int[] profit, int[] weight, int capacity, int currentIndex) {
		int [][] dp = new int[profit.length][capacity+1];
		if (currentIndex >= profit.length || capacity <= 0 || currentIndex < 0)
			return 0;
		int chooseItem = 0;
		if(dp[currentIndex][capacity] != 0)
			return dp[currentIndex][capacity];
		if (weight[currentIndex] <= capacity)
			chooseItem = profit[currentIndex]
					+ auxMaximizeProfit(profit, weight, (capacity - weight[currentIndex]), currentIndex + 1);
		int doNotChooseItem = auxMaximizeProfit(profit, weight, capacity, currentIndex + 1);
		dp[currentIndex][capacity] = Math.max(chooseItem, doNotChooseItem);
		return dp[currentIndex][capacity];
	}
}
package com.dynamicprogramming;

public class ZeroOneKnapsack {

	public static void main(String[] args) {

		int[] profit = { 60, 100, 120 };
		int[] weight = { 10, 20, 30 };
		int capacity = 50;
		System.out.println(maximizeProfit(profit, weight, capacity));
	}

	private static int maximizeProfit(int[] profit, int[] weight, int capacity) {
		return auxMaximizeProfit(profit, weight, capacity, 0);
	}

	private static int auxMaximizeProfit(int[] profit, int[] weight, int capacity, int currentIndex) {
		if (currentIndex >= profit.length || capacity <= 0 || currentIndex < 0)
			return 0;
		int chooseItem = 0;
		if (weight[currentIndex] <= capacity)
			chooseItem = profit[currentIndex]
					+ auxMaximizeProfit(profit, weight, (capacity - weight[currentIndex]), currentIndex + 1);
		int doNotChooseItem = auxMaximizeProfit(profit, weight, capacity, currentIndex + 1);
		return Math.max(chooseItem, doNotChooseItem);
	}
}

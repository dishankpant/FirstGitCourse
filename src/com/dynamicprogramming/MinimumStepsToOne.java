package com.dynamicprogramming;

public class MinimumStepsToOne {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(minStepsUsingRecursion(num));

		int arr[] = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			arr[i] = -1;
		}
		System.out.println(minStepsUsingTopDownDP(num, arr));

		System.out.println(minStepsUsingBottomUpDP(num));
	}

	private static int minStepsUsingRecursion(int num) {

		int x = 0;
		int y = Integer.MAX_VALUE;
		int z = Integer.MAX_VALUE;
		if (num <= 1)
			return 0;
		x = minStepsUsingRecursion(num - 1);
		if (num % 2 == 0)
			y = minStepsUsingRecursion(num / 2);
		if (num % 3 == 0)
			z = minStepsUsingRecursion(num / 3);

		return Math.min(z, Math.min(x, y)) + 1;
	}

	private static int minStepsUsingTopDownDP(int num, int arr[]) {

		int x = 0;
		int y = Integer.MAX_VALUE;
		int z = Integer.MAX_VALUE;
		if (num <= 1)
			return 0;
		if (arr[num] != -1)
			return arr[num];
		x = minStepsUsingTopDownDP(num - 1, arr);
		if (num % 2 == 0)
			y = minStepsUsingTopDownDP(num / 2, arr);
		if (num % 3 == 0)
			z = minStepsUsingTopDownDP(num / 3, arr);

		int output = Math.min(z, Math.min(x, y)) + 1;
		arr[num] = output;
		return output;
	}

	private static int minStepsUsingBottomUpDP(int num) {

		int arr[] = new int[num + 1];
		arr[0] = 0;
		arr[1] = 0;

		for (int i = 2; i <= num; i++) {
			int y = Integer.MAX_VALUE;
			int z = Integer.MAX_VALUE;
			int x = arr[i - 1];
			if (num % 2 == 0)
				y = arr[i / 2];
			if (num % 3 == 0)
				z = arr[i / 3];

			arr[i] = Math.min(x, Math.min(y, z)) + 1;

		}
		return arr[num];
	}
}
package com.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KSortedArray {

	public static void main(String[] args) {
		int k = 3;
		int arr[] = { 10, 12, 6, 7, 9 };
		sortKSortedArray(arr, k, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void sortKSortedArray(int[] arr, int k, int length) {

		PriorityQueue<Integer> queue = new PriorityQueue<>(k, Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			queue.add(arr[i]);
		}
		int start = 0;
		for (int i = k; i < length; i++) {
			arr[start] = queue.peek();
			queue.poll();
			start++;
			queue.add(arr[i]);
		}
		while (!queue.isEmpty()) {
			arr[start] = queue.peek();
			queue.poll();
			start++;
		}
	}
}
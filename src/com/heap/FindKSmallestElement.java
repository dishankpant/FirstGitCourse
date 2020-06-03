package com.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKSmallestElement {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 12, 10, 0, 1, 6, 7 };
		int k = 2;
		PriorityQueue<Integer> queue = getKElements(arr, k);
		for(Integer i : queue) {
			System.out.println(i+" ");
		}
	}

	private static PriorityQueue<Integer> getKElements(int[] arr, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k,Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			queue.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if(arr[i] < queue.peek()) {
				queue.poll();
				queue.add(arr[i]);
			}
		}
		return queue;
	}
}

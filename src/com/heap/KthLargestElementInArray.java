package com.heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

	public static void main(String[] args) {

		Integer arr[] = {4,8,0,-1,6,12,15};
		int k = 3;
		kthLargestElement(arr,k);
	}

	private static void kthLargestElement(Integer[] arr, int k) {
		List<Integer> list = Arrays.asList(arr);

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)->(b-a));
		queue.addAll(list);
		while(--k > 0) {
			queue.poll();
		}
		System.out.println(queue.peek());
	}

}

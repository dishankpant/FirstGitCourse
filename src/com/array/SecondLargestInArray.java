package com.array;

public class SecondLargestInArray {

	public static void main(String[] args) {

		int [] arr = {12, 35, 1, 10, 34, 1};
		findSecondLargest(arr);
	}

	private static void findSecondLargest(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
				
			} else if(arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		System.out.println("Second larget is "+ second);
	}
}

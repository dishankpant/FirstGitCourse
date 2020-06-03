package com.array.biranysearch;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 7, 10, 17, 20 };
		System.out.println(binarySearch(arr, 0, arr.length - 1, 7));
	}

	private static int binarySearch(int[] arr, int start, int length, int value) {

		if (length >= start) {
			int mid = start + (length - start) / 2;
			if (arr[mid] == value) {
				return mid;
			}

			if (value < arr[mid]) {
				return binarySearch(arr, 0, mid - 1, value);
			} else {
				return binarySearch(arr, mid + 1, length, value);
			}
		}
		return -1;
	}
}

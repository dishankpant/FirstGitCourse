package com.prep.sorting;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = { 3, 0, -4, 7, 10, 5 };
		
		QuickSort sort = new QuickSort();

		sort.quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(arr[i] + " ");
		}
	}

	private void quickSort(int[] arr, int start, int end) {

		if (start >= end)
			return;
		int partitionIndex = partition(arr, start, end);
		quickSort(arr, start, partitionIndex - 1);
		quickSort(arr, partitionIndex + 1, end);

	}

	private int partition(int[] arr, int start, int end) {

		int lastItem = arr[end];
		
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			if (arr[j] < lastItem) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}
}
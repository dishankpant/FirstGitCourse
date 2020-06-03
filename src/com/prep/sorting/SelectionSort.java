package com.prep.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {-1,7,5,0,2,-2};
		for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
			int largest = 0;
			for(int i=1; i<= lastUnsortedIndex; i++) {
				if(arr[i] > arr[largest]) {
					largest = i;
				}
			}
			swap(arr, largest, lastUnsortedIndex);
		}
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void swap(int arr[], int i, int j) {
		if(i==j)
			return;
		else {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}

package com.array;

public class RotateArrayByKSteps {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k=3;
		rotateByKSteps(arr,k);
	}

	private static void rotateByKSteps(int[] arr, int k) {
		int counter=0;
		int [] tempArray = new int[k];
		for(int i=1; i<=k; i++) {
			rotateOnebyOne(arr,i);
		}
	}

	private static void rotateOnebyOne(int[] arr, int k) {
		arr[0] = arr[arr.length-1];
		for(int i=1; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
	}

}

package com.prep.sorting;

public class MergeSort {

	public void mergeSort(int [] arr,int l, int r) {
		
		int mid = (l + r)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1, r);
		merge(arr, l, mid, r);
	}
	private void merge(int[] arr, int l, int mid, int r) {

		int [] L = new int[mid-l];
		int [] R = new int[r-mid];
		for(int i=0; i<L.length; i++) {
			for(int j=0; j<R.length; i++) {
				if(L[i] < R[j]) {
					arr[i] = L[i];
					i++;
				} else {
					arr[j] = R[j];
					j++;
				}
			}
		}
		
	}
	public static void main(String[] args) {

		
	}

}

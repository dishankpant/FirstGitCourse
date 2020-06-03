package com.heap;

public class CheckIfArrayRepresentsMinHeap {
	static int[] arr = { 1,2,3,4,5,6};

	public static void main(String[] args) {

		System.out.println(checkIfMinHeap(arr, 0));
	}

	public static int getParent(int index) {
		return (index - 1) / 2;
	}

	public static int getLeftChild(int index) {
		return (2 * index + 1);
	}

	public static int getRightChild(int index) {
		return (2 * index + 2);
	}

	public static boolean hasLeftChild(int index) {
		return (2 * index + 1) < arr.length;
	}

	public static boolean hasRightChild(int index) {
		return (2 * index + 2) < arr.length;
	}

	private static boolean checkIfMinHeap(int[] arr, int index) {

		if (2 * index + 2 > arr.length) {
			return true;
		}
		boolean ifLeftChildHeap = hasLeftChild(index) && arr[index] <= arr[getLeftChild(index)] && checkIfMinHeap(arr, getLeftChild(index));
		boolean ifRightChildHeap = hasRightChild(index) || arr[index] <= arr[getRightChild(index)] && checkIfMinHeap(arr, getRightChild(index));
		return ifLeftChildHeap && ifRightChildHeap;
	}
}

package com.queue;

public class CircularQueueUsingArray {

	int topOfQueue = 0;
	int beginingOfQueue = 0;
	static int arr[] = null;

	public CircularQueueUsingArray(int size) {
		arr = new int[size];
	}

	public void enQueue(int data) {
		if (topOfQueue == arr.length && beginingOfQueue == 0) {
			System.out.println("Sorry! Queue is full");
		} else if (topOfQueue == arr.length && beginingOfQueue != 0) {
			topOfQueue = 0;
			arr[topOfQueue] = data;
		} else {
			arr[topOfQueue] = data;
			topOfQueue++;
		}
	}

	public int deQueue() {
		if (topOfQueue == 0 && beginingOfQueue == 0) {
			System.out.println("Sorry! Queue is Empty");
		}
		int data = arr[beginingOfQueue];
		arr[beginingOfQueue] = 0;
		if(topOfQueue == beginingOfQueue) {
			topOfQueue = beginingOfQueue = 0;
		} else if(beginingOfQueue == arr.length) {
			beginingOfQueue = 0;
		} else {
			beginingOfQueue++;
		}
		return data;
	}

	public static void main(String[] args) {

		CircularQueueUsingArray array = new CircularQueueUsingArray(5);
		array.enQueue(5);
		array.enQueue(8);
		array.enQueue(2);
		array.enQueue(0);
		array.enQueue(52);
		for (int i : arr) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println(array.deQueue());
		array.enQueue(53);
		for (int i : arr) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println(array.deQueue());
	}
}

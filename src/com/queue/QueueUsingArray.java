package com.queue;

public class QueueUsingArray {
	int topOfQueue = 0;
	int beginingOfQueue = 0;
	int [] arr = null;
	public QueueUsingArray(int size) {
		arr = new int[size];
	}
	
	public void enqueue(int data) {
		if(topOfQueue == arr.length) {
			System.out.println("Oh! queue is full");
		} else {
			arr[topOfQueue] = data;
			topOfQueue++;
		}
	}
	
	public int deQueue() {
		if(topOfQueue == beginingOfQueue) {
			System.out.println("Oh! queue is empty");
			return 0;
		}
		int data = arr[beginingOfQueue];
		if(topOfQueue == beginingOfQueue) {
			topOfQueue = beginingOfQueue = 0;
		} else {
			beginingOfQueue++;
		}
		return data;
	}

	public static void main(String[] args) {

		QueueUsingArray array = new QueueUsingArray(5);
		array.enqueue(5);
		array.enqueue(8);
		array.enqueue(2);
		array.enqueue(0);
		array.enqueue(52);
		array.enqueue(56);
		
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
	}

}

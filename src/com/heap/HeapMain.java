package com.heap;

public class HeapMain {

	public static void main(String[] args) {

		Heap heap = new Heap(5);
		try {
			heap.insertNode(1);
			heap.insertNode(4);
			heap.insertNode(30);
			heap.insertNode(0);
			heap.insertNode(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		heap.printHeap();
	}
}

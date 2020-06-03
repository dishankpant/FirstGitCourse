package com.heap;

import java.util.Arrays;

public class Heap {

	int[] heap;
	int size;
	int capacity;

	public Heap(int capacity) {
		heap = new int[capacity];
		this.capacity = capacity;
	}

	public boolean isFull() {
		return size == heap.length;
	}

	public int getParent(int index) {
		return (index - 1) / 2;
	}

	public int getLeftChild(int index) {
		return 2 * index + 1;
	}

	public int getRightChild(int index) {
		return 2 * index + 2;
	}

	public boolean hasLeftChild(int index) {
		return 2 * index + 1 < size;
	}

	public boolean hasRightChild(int index) {
		return 2 * index + 2 < size;
	}

	public boolean hasParent(int index) {
		return (index - 1) / 2 >= 0;
	}

	public void insertNode(int value) throws Exception {
		if (size == heap.length) {
			throw new Exception("Heap is full!!");
		}
		heap[size] = value;
		fixHeapAbove(size);
		size++;
	}

	public void increaseCapacity() {
		if (size == capacity) {
			heap = Arrays.copyOf(heap, capacity * 2);
		}
	}

	public void fixHeapAbove(int index) {
		int newValue = heap[index];
		while (index > 0 && heap[index] > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		heap[index] = newValue;
	}

	public void delete(int index) {

		int parentIndex = getParent(index);
		// int leftChild = leftChild(index, true);
		// int rightChild = leftChild(index, false);
		// swap value at index with the last value;
		heap[index] = heap[size - 1];
		int elementToBeDeleted = heap[index];
		if (index == 0 || heap[index] < heap[parentIndex]) {
			//fixHeapBelow(index);
		}

	}

	public int leftChild(int index, boolean left) {
		return left ? 2 * index + 1 : 2 * index + 2;
	}


	public void printHeap() {
		for (int i = 0; i < heap.length; i++) {
			System.out.print(heap[i] + ",");
		}
	}
}
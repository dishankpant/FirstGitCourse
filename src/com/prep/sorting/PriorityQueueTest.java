package com.prep.sorting;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		ComparatorClass obj = new ComparatorClass();

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(obj);

		pq.add(1);
		pq.add(70);
		pq.add(6);
		System.out.println(pq.peek());
	}

}

class ComparatorClass implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		}
		if (o1 < o2) {
			return 1;
		}
		return 0;
	}

}

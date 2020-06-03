package com.prep.linkedlist;

public class SortListContaining0s1s2s {

	SingleNode head;
	SingleNode tail;

	public SingleNode createLinkedList(int value) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(null);
		head = node;
		tail = node;
		return head;
	}

	public void insert(int value, int location) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		if (location == 0) {
			node.setNext(head);
			head = node;
		}
	}

	public void sortList() {
		int[] count = { 0, 0, 0 };
		SingleNode temp = head;
		while (temp != null) {
			count[temp.getValue()]++;
			temp = temp.next;
		}
		int i = 0;
	    temp = head;
		while (temp != null) {
			if(count[i] == 0) {
				i++; 
			} else {
				temp.setValue(i);
				count[i]--;
				temp = temp.next;
			}
		}
	}

	public void traverseSortedList() {
		SingleNode temp = head;
		while (temp != null) {
			System.out.print(temp.getValue() + "->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		SortListContaining0s1s2s list = new SortListContaining0s1s2s();
		list.createLinkedList(1);
		list.insert(0, 0);
		list.insert(1, 0);
		list.insert(2, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		list.insert(0, 0);
		list.sortList();
		list.traverseSortedList();

	}
}
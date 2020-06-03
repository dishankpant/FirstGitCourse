package com.prep.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleInLinkedList {

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

	public SingleNode insertNode(int value, int location) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		if (location == 0) {
			node.setNext(head);
			head = node;
		}
		return head;
	}

	public SingleNode traverse() {
		SingleNode temp = head;
		while (temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.next;
		}
		return head;
	}

	public boolean detectCycleUsingFloydsCircle() {
		SingleNode slowPointer = head;
		SingleNode fastPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) {
				return true;
			}
		}
		return false;
	}
	
	public boolean detectCycleUsingHashing() {
		Set<SingleNode> set = new HashSet<>();
		SingleNode temp = head;
		while(temp != null) {
			if(!set.contains(temp)) {
				set.add(temp);
			} else {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public static void main(String[] args) {

		DetectCycleInLinkedList list = new DetectCycleInLinkedList();
		list.createLinkedList(6);
		list.insertNode(4, 0);
		list.insertNode(7, 0);
		list.insertNode(0, 0);
		list.insertNode(9, 0);
		list.head.next.next.next = list.head;
		System.out.println(list.detectCycleUsingFloydsCircle());
		System.out.println(list.detectCycleUsingHashing());
		// list.traverse();
	}
}
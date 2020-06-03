package com.stack;

import com.prep.linkedlist.SingleNode;

public class QueueUsingLinkedList {

	SingleNode head;
	SingleNode tail;
	int size;

	public void createLinkedlist(int value) {
		SingleNode node = new SingleNode();
		node.setNext(null);
		node.setValue(value);
		head = node;
		tail = node;
		size = 1;
	}
	public void insertLinkedlist(int value, int location) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		if (location == 0) {
			node.setNext(head);
			head = node;
		} else if (location >= size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {
			int index = 0;
			SingleNode temp = head;
			while (index < location - 1) {
				temp = temp.getNext();
				index++;
			}
			temp.setNext(node);
			SingleNode nodeAfterTemp = temp.getNext();
			node.setNext(nodeAfterTemp);
		}
		size++;
	}

	public void enqueue(int value) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(tail);
		tail = node;
	}
	
	public int deQueue() {
		if(head == null) {
			System.out.println("Queue is empty");
			return 0;
		}
		int value = head.getValue();
		head = head.getNext();
		return value;
	}

	public int peak() {
		if (head == null) {
			System.out.println("Queue is empty");
		}
		return head.getValue();
	}
	
	public void traverse() {
		SingleNode temp = head;
		while (temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.getNext();
		}
	}
	
	
	public static void main(String[] args) {
		QueueUsingLinkedList list = new QueueUsingLinkedList();
		list.createLinkedlist(7);
		list.insertLinkedlist(0, 0);
		list.insertLinkedlist(45, 0);
		list.insertLinkedlist(10, 1);
		//list.insertLinkedlist(3, 2);
		list.traverse();
	}
}
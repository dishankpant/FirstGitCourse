package com.prep.linkedlist;

public class SingleLinkedList {

	SingleNode head = null;
	SingleNode tail = null;
	private int size;

	public SingleNode createSingleLinkedList(int value) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertNode(int value, int location) {
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
			SingleNode temp = head;
			int index = 0;
			while (index < location - 1) {
				temp = temp.getNext();
				index++;
			}
			temp.setNext(node);
			SingleNode nodeAfterNewNode = temp.getNext();
			node.setNext(nodeAfterNewNode);
		}
		size = size + 1;
	}

	public void tranverse() {
		SingleNode temp = head;
		while (temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.next;
		}
	}
}

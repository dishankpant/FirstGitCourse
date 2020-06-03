package com.prep.linkedlist;

public class SingleLinkedListMain {

	public static void main(String[] args) {

		SingleLinkedList list = new SingleLinkedList();
		SingleNode head = list.createSingleLinkedList(5);
		list.insertNode(4, 0);
		list.insertNode(8, 0);
		list.insertNode(9, 1);
		list.tranverse();
	}

}

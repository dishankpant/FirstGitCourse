package com.prep.linkedlist;

public class DoubleLinkedListMain {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		DoublyNode node1 = new DoublyNode(6);
		DoublyNode node2 = new DoublyNode(10);
		list.addToFront(node1);
		list.addToFront(node2);
		list.printList();
		DoublyNode nodeLast = list.getLastNode();
		System.out.println(nodeLast.data);
	}

}

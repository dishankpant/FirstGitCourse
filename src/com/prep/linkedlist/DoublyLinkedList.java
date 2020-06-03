package com.prep.linkedlist;

public class DoublyLinkedList {

	DoublyNode head;
	DoublyNode tail;

	public void addToFront(DoublyNode node) {

		if (head == null) {
			node.setNext(null);
			node.setPrev(null);
		} else {
			node.setNext(head);
			node.setPrev(null);
		}
		head = node;
		tail = node;
	}
	
	public void printList() {
		DoublyNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
    public DoublyNode getLastNode() {
        if (head == tail) return null;
        return tail;
    }
 
	
	
}

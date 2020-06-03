package com.prep.linkedlist;

public class DoublyNode {

	int data;
	DoublyNode prev;
	DoublyNode next;
	public DoublyNode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyNode getPrev() {
		return prev;
	}
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	public DoublyNode getNext() {
		return next;
	}
	public void setNext(DoublyNode next) {
		this.next = next;
	}
}

package com.stack;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class StackUsingLinkedList {

	Node head;

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public int pop() throws Exception {
		if (head == null) {
			throw new Exception("LinkedListEmpty");
		}
		int value = head.data;
		head = head.next;
		return value;
	}

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(5);
		stack.push(6);
		stack.push(10);
		stack.push(40);
		try {
			System.out.println(stack.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

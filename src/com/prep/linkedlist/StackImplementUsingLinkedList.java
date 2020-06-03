package com.prep.linkedlist;

public class StackImplementUsingLinkedList {

	SingleNode top;
	SingleNode tail;

	public void push(int value) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(top);
		top = node;
	}

	public int pop() {
		if (top == null) {
			System.out.println("Stack is empty");
		}
		int value = top.value;
		top = top.next;
		return value;
	}

	public int peek() {

		if(top == null) {
			System.out.println("Stack is empty");
		}
		return top.value;
	}
}

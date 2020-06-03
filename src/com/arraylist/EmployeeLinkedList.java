package com.arraylist;

public class EmployeeLinkedList {

	EmployeeNode head;
	EmployeeNode tail;
	int size;

	public void addEmpToFront(Employee emp) {
		EmployeeNode node = new EmployeeNode(emp);
		node.setNext(head);
		if(head == null) {
			tail = node;
		} else {
			head.setPrev(node);
		}
		head = node;
		size++;
	}

	public int getSize() {
		return size;
	}

	public EmployeeNode removeEmpFromFront() {
		if (isEmpty())
			return null;
		EmployeeNode emp = head;
		head = emp.getNext();
		size--;
		return emp;
	}

	public void printList() {
		EmployeeNode temp = head;
		while (temp != null) {
			System.out.print(temp + "->");
			temp = temp.getNext();
		}
	}

	private boolean isEmpty() {
		return head == null;
	}
}

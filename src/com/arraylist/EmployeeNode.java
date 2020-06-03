package com.arraylist;

public class EmployeeNode {

	Employee emp;
	EmployeeNode next;
	EmployeeNode prev;

	public EmployeeNode(Employee emp) {
		this.emp = emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public EmployeeNode getPrev() {
		return prev;
	}

	public void setPrev(EmployeeNode prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "EmployeeNode [emp=" + emp + ", next=" + next + ", prev=" + prev + "]";
	}
}

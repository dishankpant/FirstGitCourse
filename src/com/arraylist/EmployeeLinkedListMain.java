package com.arraylist;

public class EmployeeLinkedListMain {

	public static void main(String[] args) {

		Employee e1 = new Employee("Dishank", "Pant", 23);
		Employee e2 = new Employee("Harish", "Mehta", 23);
		Employee e3 = new Employee("Shubham", "Pandey", 23);
		Employee e4 = new Employee("Mohit", "Joshi", 23);
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addEmpToFront(e1);
		list.addEmpToFront(e2);
		list.addEmpToFront(e3);
		list.addEmpToFront(e4);

		System.out.println("Size is" + list.getSize());

		list.printList();

		list.removeEmpFromFront();

		System.out.println("----------------list after removal of a node----------------");

		System.out.println("Size is" + list.getSize());

		list.printList();
	}
}
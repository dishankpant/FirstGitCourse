package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Dishank","Pant",23));
		list.add(new Employee("Harish","Mehta",23));
		list.add(new Employee("Shubham","Pandey",23));
		
		list.add(new Employee("Dishank","Pant",23));
		
		if(list.contains(new Employee("Dishank","Pant",23))) {
			System.out.println("True");
		}
	}

}

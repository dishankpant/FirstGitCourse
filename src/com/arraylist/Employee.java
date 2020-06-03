package com.arraylist;

public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	

	public Employee(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; if (age != other.age) return false;
	 * if (firstName == null) { if (other.firstName != null) return false; } else if
	 * (!firstName.equals(other.firstName)) return false; if (lastName == null) { if
	 * (other.lastName != null) return false; } else if
	 * (!lastName.equals(other.lastName)) return false; return true; }
	 */

	@Override
	public boolean equals(Object o) {
		if (o == null || this.getClass() != o.getClass())
			return false;
		Employee e = (Employee) o;
		if (e.age != this.age)
			return false;
		if (!(e.firstName.equals(this.firstName)))
			return false;
		return e.lastName.equals(this.lastName);
	}

}
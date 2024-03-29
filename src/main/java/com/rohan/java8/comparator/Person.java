package com.rohan.java8.comparator;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int salary;

	public Person(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Person o) {
		if (this.salary > o.salary)
			return 1;
		else if (this.salary < o.salary)
			return -1;
		return 0;
	}
}

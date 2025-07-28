package com.rohan.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompatorWithLambdas {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Rohan", 30));
		list.add(new Student(2, "Vivek", 29));
		list.add(new Student(3, "Nikhil", 32));
		list.add(new Student(4, "Ajit", 32));
		
		System.out.println("Before Sort");
		System.out.println(list);


		list.sort(Comparator.comparing((s1) -> {
					return s1.getAge();
				}

		));
		System.out.println("asd");
		list.sort((Student o1, Student o2) -> {
			return (int) (o1.getAge() - o2.getAge());
		});
		System.out.println(list);

		System.out.println("asd");

		list.sort(Comparator.comparing((s1) -> s1.getAge()));

		//sort by Name , Using Collection.sort method
		Collections.sort(list, (Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(list);
		System.out.println();

		//sort by Age, Using inbuilt List.sort, Java 8
		list.sort((Student s1, Student s2) -> (int)s1.getAge() - (int)s2.getAge());

		System.out.println(list);

		// sorting by Age
		list.sort(Comparator.comparing(Student::getAge));
		System.out.println(list);

		// sorting by Age Desc
		list.sort(Comparator.comparing(Student::getAge).reversed());
		System.out.println(list);

		// sorting by ID asc, Age Desc
		list.sort(Comparator.comparing(Student::getId).reversed().thenComparing(Comparator.comparing(Student::getAge).reversed());
		System.out.println(list);




	}

}

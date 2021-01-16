package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassicComparator {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Rohan", 30));
		list.add(new Student(2, "Vivek", 29));
		list.add(new Student(3, "Nikhil", 32));
		list.add(new Student(3, "Ajit", 32));
		
		Collections.sort(list, new Comparator<Student>() {
			   @Override
	            public int compare(Student s1, Student s2) {
	                return s1.getName().compareTo(s2.getName());
	            };
		});
		
		System.out.println(list);
		
	}
}


class Student{
	private int id;
	private String name;
	private float age;
	
	Student(int id, String name, float age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
	   return "Id = " + this.id + ", Name = " +  this.name + ", Age = " + this.age + "\n";
	}
	
	public float getAge() {
		return age;
	}
}

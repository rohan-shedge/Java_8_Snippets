package comparator;

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

		//sort by Name
		Collections.sort(list, (Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(list);
		System.out.println();

		//sort by Age
		//Collections.sort(list, (Student s1, Student s2) -> {return s1.getAge() - s2.getAge();});
		list.sort((Student s1, Student s2) -> (int)s1.getAge() - (int)s2.getAge());

		System.out.println(list);
		
	}

}

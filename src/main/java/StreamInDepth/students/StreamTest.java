package StreamInDepth.students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.rohan.java8.streambasics.Collect;

import sun.net.www.content.text.plain;

public class StreamTest {
	public static void main(String[] args) {

		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> list = Arrays.asList(student1, student2, student3);
		list.forEach(s -> System.out
				.println(s.getName() + " " + s.getAge() + " " + s.getAddress() + " " + s.getMobileNumbers()));

		/*****************************************************
		 * Get student with exact match name "jayesh"
		 *****************************************************/

		System.out.println("\n***Query 1****Get student with exact match name \"jayesh\"*********");
		Optional<Student> stu = list.stream().filter(s -> s.getName().equals("Jayesh")).findFirst();

		if (stu.isPresent()) {
			System.out.println(stu.get().getName() + " " + stu.get().getAge());
		} else {
			System.out.println("No Student Found");
		}

		/*****************************************************
		 * Get student with matching address "1235"
		 *****************************************************/
		System.out.println("\n***Query 2*****Get student with matching address \"1235\"**");
		stu = list.stream().filter(s -> s.getAddress().getZipcode() == "1235").findFirst();

		if (stu.isPresent()) {
			System.out.println(stu.get().getName() + " " + stu.get().getAge());
		} else {
			System.out.println("No Student Found");
		}

		/*****************************************************
		 * Get all student having mobile numbers 3333
		 *****************************************************/

		System.out.println("\n***Query 3*****Get all student having mobile numbers 3333");
		List<Student> stuList = list.stream().filter(s -> {
			List<MobileNumber> mobList = s.getMobileNumbers();
			return mobList.stream().anyMatch(m -> m.getNumber().equals("3333"));
		}).collect(Collectors.toList());

		stuList.forEach(s -> System.out
				.println(s.getName() + " " + s.getAge() + " " + s.getAddress() + " " + s.getMobileNumbers()));

		/*****************************************************
		 * Get all student having mobile number 1233 and 1234
		 *****************************************************/

		System.out.println("\n***Query 4***Get all student having mobile number 1233 and 1234");

		stuList = list.stream().filter(s -> {
			List<MobileNumber> mobList = s.getMobileNumbers();
			return mobList.stream().allMatch(m -> (m.getNumber().equals("1233") || m.getNumber().equals("1234")));
		}).collect(Collectors.toList());
		stuList.forEach(s -> System.out
				.println(s.getName() + " " + s.getAge() + " " + s.getAddress() + " " + s.getMobileNumbers()));

		/*****************************************************
		 * Create a List<Student> from the List<TempStudent>
		 *****************************************************/
		System.out.println("\n***Query 5 ***  Create a List<Student> from the List<TempStudent>");
		TempStudent tmpStud1 = new TempStudent("Jayesh1", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

		TempStudent tmpStud2 = new TempStudent("Khyati1", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

		List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);

		List<Student> studentList = tmpStudents.stream()
				.map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
				.collect(Collectors.toList());

		System.out.println(studentList);
		System.out.println("--------------------");

		/*****************************************************
		 * Convert List<students> to String
		 *****************************************************/
		System.out.println("\n***Query 6 ***  Convert List<students> to String");
		String name = list.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(name);
		System.out.println("--------------------");
		
		
		 /*****************************************************
        Change the case of List<String>
       *****************************************************/
		System.out.println("\n***Query 7 ***   Change the case of List<String>");
       List<String> nameList =
           Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
       nameList = nameList.stream()
               .map(String::toUpperCase)
               .collect(Collectors.toList());
       nameList.forEach(System.out::println);
               
       /*****************************************************
       Sort List<String>
       *****************************************************/
   	System.out.println("\n***Query 8 ***   Change the case of List<String>");
       List<String> namesList =
          Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
       nameList.stream()
               .sorted()
               .forEach(System.out::println);
	}
}

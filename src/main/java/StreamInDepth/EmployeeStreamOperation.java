package StreamInDepth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamOperation {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
        
		list.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		list.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		list.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		list.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		list.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		list.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		list.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		list.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		list.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		list.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		list.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		list.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		list.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		list.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		//1. How many male and female employees are there in the organization?
		Map<String, Long> avgCount =
		list.stream()
		    .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		avgCount.forEach((x, y) -> System.out.print(x + " -> " + y));
		
		System.out.println();
		
		//2. Print the name of all departments in the organization?
		List<String> deptNames =list.stream()
		    .map(e -> e.department)
		    .distinct()
		    .collect(Collectors.toList());
		System.out.println(deptNames);
		
		//3 : What is the average age of male and female employees?
		Map<String, Double> avgAge =
		list.stream()
		    .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
		avgAge.forEach((k, v) -> System.out.println(k + " -> " + v)); 		
		System.out.println(deptNames);
		
		//4 : Get the details of highest paid employee in the organization?
		Optional<Employee> e4 = list.stream()
		    .max(Comparator.comparing(Employee::getSalary));
		System.out.println(e4.get().getName());
		System.out.println();
		
		//5 : Get the names of all employees who have joined after 2015?
		List<String> empList = list.stream()
		    .filter(e5 -> (e5.getYearOfJoining() > 2015))
		    .map(e5 -> e5.getName())
		    .collect(Collectors.toList());
		empList.forEach(System.out::println);
		System.out.println();
		    
		//6 : Count the number of employees in each department?
		
		Map<String, Long> deptCount =
		list.stream()
		    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		    
		deptCount.forEach((k, v) -> System.out.println(k + " -> " + v)); 		
		System.out.println();
		
	}
}

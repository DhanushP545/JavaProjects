package service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import data.*;


public class EmployeeService {
	
	static Map<Integer, Employee> database = EmployeeDataProvider.init();
	
	public static void displayAllEMployees() {
		System.out.println("...Displaying all Employee details...");
		database.values().stream()
		.forEach(System.out::println);
	};
	
	public static void searchByDepartment(String dept) {
		System.out.println("...Displaying Employees of "+dept+" department...");
		database.values().stream()
		.filter(e -> e.getDepartment().equalsIgnoreCase(dept))
		.forEach(System.out::println);
	}
	
	public static void highEarningEmployees() {
		System.out.println("...Displaying Employees with more than 75000 Salary...");
		database.values().stream()
		.filter(e -> e.getSalary()>=75000)
		.forEach(System.out::println);
	}
	
	public static void sortEmployees(int option) {
		if(option == 4)System.out.println("Sorted by salary(Ascending order)... ");
		else if(option == 5) System.out.println("Sorted by salary(Descending order)... ");
		else System.out.println("Sorted by Name(Alphabetical order)... ");
		database.values().stream()
		.sorted((a,b)->{
			if(option == 4) return (int)(a.getSalary()-b.getSalary());
			else if(option == 5) return (int)(b.getSalary()-a.getSalary());
			else return a.getEmployeeName().compareTo(b.getEmployeeName());
		})
		.forEach(System.out::println);;	
	}
	
	public static void getEmployeNames() {
		System.out.println("Employee Names only...");
		
		database.values().stream()
		.map(Employee::getEmployeeName)
		.forEach(System.out::println);
	}
	
	public static void totalSalary() {
		double totalSal = database.values().stream()
				.map(Employee::getSalary)
				.reduce(0.0, Double::sum);
		System.out.println("Total Salary of all employees : "+totalSal);
	}
	
	public static void averageSalary() {
		OptionalDouble totalSal = database.values().stream()
				.mapToDouble(Employee::getSalary)
				.average();
		System.out.println("Total Salary of all employees : "+ totalSal.orElse(0.0));
	}
	
	public static void maxSalEmp() {
		Optional<Employee> e = database.values().stream()
				.max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println("Highest Paid Employee Details..");
		System.out.println(e.orElse(null));
	}
	
	public static void minSalEmp() {
		Optional<Employee> e = database.values().stream()
				.min(Comparator.comparingDouble(Employee::getSalary));
		System.out.println("Least Paid Employee Details..");
		System.out.println(e.orElse(null));
	}
	
	public static void groupByDept() {
		Map<String,List<Employee>> deptGroup = database.values().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		deptGroup.keySet().stream()
		.forEach(dept->{
			System.out.printf("\n ==== Employees of %s department ====\n",dept);
			deptGroup.get(dept).stream()
			.forEach(System.out::println);
		});
	}
	public static void countByDept() {
		Map<String,Long> deptGroup = database.values().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		deptGroup.keySet().stream()
		.forEach(dept->{
			System.out.printf("\n Number of Employees in %s department - %d\n",dept,deptGroup.get(dept));
		});
	}
	
	public static void averageByDept() {
		Map<String,Double> deptGroup = database.values().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		deptGroup.keySet().stream()
		.forEach(dept->{
			System.out.printf("\n Number of Employees in %s department - %.2f\n",dept,deptGroup.get(dept));
		});
	}
	
	public static void findById(int id) {
		Optional<Employee> e = Optional.ofNullable(database.get(id));
		e.ifPresentOrElse(
			    System.out::println,
			    () -> System.out.println("Employee not found")
			);
		
	}
	
	public static void displayMenu() {
		System.out.println("\n==================================================\n"
				+ "EMPLOYEE ANALYTICS CONSOLE MENU\n"
				+ "==================================================\n"
				+ "1. Display All Employees\n"
				+ "2. Search Employees By Department\n"
				+ "3. Show High Salary Employees\n"
				+ "4. Sort By Salary (Ascending)\n"
				+ "5. Sort By Salary (Descending)\n"
				+ "6. Sort By Name\n"
				+ "7. Display Employee Names Only\n"
				+ "8. Total Salary Expenditure\n"
				+ "9. Average Salary\n"
				+ "10. Highest Paid Employee\n"
				+ "11. Lowest Paid Employee\n"
				+ "12. Group Employees By Department\n"
				+ "13. Employee Count Per Department\n"
				+ "14. Average Salary Per Department\n"
				+ "15. Find Employee By ID\n"
				+ "16. Exit\n");
	}
	
}

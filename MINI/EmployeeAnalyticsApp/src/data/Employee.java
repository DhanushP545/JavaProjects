package data;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String department;
	private double salary;
	private int age;
	private String email;
	
	public Employee(int employeeId, String employeeName, String department, double salary, int age, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.email = email;
	}
	public Employee(String employeeName, String department, double salary, int age, String email) {
		super();
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.email = email;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\nEmployeeId - " + employeeId + "\nEmployee Name - " + employeeName + "\nDepartment - " + department
				+ "\nSalary - " + salary + "\nAge - " + age + "\nEmail - " + email + "\n";
	}
	
	
}

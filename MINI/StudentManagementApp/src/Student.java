
public class Student extends Person {
	private int studentId;
	private String department;
	private static int studentCount = 0;
	Student(int studentId){
		this.studentId = studentId;
		studentCount++;
	}
	Student(int studentId, String name, int age, String department){
		super(name, age);
		this.studentId = studentId;
		this.department = department;
		studentCount++;
	}
	public static int getStudentCount() {
		return Student.studentCount;
	}
	@Override
	public void displayDetails() {
		System.out.printf("Student Id: %d\n"
				+ "Name: %s\n"
				+ "Age: %d\n"
				+ "Department: %s\n"
				,studentId, super.getName(), super.getAge(), department);
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}

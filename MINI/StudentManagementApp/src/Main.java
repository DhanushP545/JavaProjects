import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner sc;
	static Map<Integer, Student> db;
	public static void main(String arg[]) {
		db = new HashMap<>();
		sc = new Scanner(System.in);
		int choice = 0;
		while(choice != 5) {
			printMenu();
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				addStudent();
				break;
			case 2:
				viewStudent();
				break;
			case 3:
				updateDepartment();
				break;
			case 4:
				System.out.println("Current student count: "+Student.getStudentCount());
				break;
			case 5:
				System.out.println("Exiting App....");
				break;
			default:
				System.out.println("Enter a valid choice between 1-5");
			}
		}
	}
	public static void addStudent() {
		System.out.printf("\nAdding New Student\n");
		System.out.println("Enter student details:");
		//collect the details of student
		System.out.print("Student Id: ");
		int studentId = sc.nextInt(); 
		while(db.containsKey(studentId)) {
			System.out.printf("Student with id %d exits. Choose different id.\n",studentId);
			System.out.print("Student Id: ");
			studentId = sc.nextInt();
		}
		sc.nextLine();
		System.out.print("Student Name: ");
		String name = sc.nextLine();
		System.out.print("Age: ");
		int age = sc.nextInt();
		while(age<0) {
			System.out.println("Enter valid age");
			System.out.print("Age: ");
			age = sc.nextInt();
		}
		sc.nextLine();
		System.out.print("Department: ");
		String department = sc.nextLine();
		//Enter the record into hash map database
		db.put(studentId, new Student(studentId, name, age, department));
		System.out.println("Student added successfully");
		db.get(studentId).displayDetails();
	}
	
	public static void viewStudent() {
		System.out.printf("\nViewing Student\n");
		System.out.print("Enter student id: ");
		int id = sc.nextInt();
		//check for record and then return details
		if(db.containsKey(id)) {
			Person p = db.get(id);
			p.displayDetails();
		}else {
			System.out.printf("Student with id : %d not found\n",id);
			

		}
	}
	public static void updateDepartment() {
		System.out.printf("\nUpdating Department\n");
		System.out.print("Enter student id: ");
		int id = sc.nextInt();
		sc.nextLine();
		//find student by id and update
		if(db.containsKey(id)) {
			System.out.println("Current department: "+ db.get(id).getDepartment());
			System.out.print("New department : ");
			String dept = sc.nextLine();
			db.get(id).setDepartment(dept);
			System.out.println("Update succesful");
		}else {
			System.out.println("Update failed. No user found");
		}
	}
	
	public static void printMenu() {
		System.out.printf("\n===== Student Management =====\n");
		System.out.printf("\n1. Add Student"
				+ "\n2. View Student"
				+ "\n3. Update Department"
				+ "\n4. Show student count"
				+ "\n5. Exit\n");
	}
}

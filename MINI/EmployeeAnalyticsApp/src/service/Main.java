package service;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            EmployeeService.displayMenu();
            System.out.print("Enter your choice (1-16): ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 16.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    EmployeeService.displayAllEMployees();
                    break;
                case 2:
                    System.out.print("Enter department name: ");
                    String dept = scanner.nextLine();
                    EmployeeService.searchByDepartment(dept);
                    break;
                case 3:
                    EmployeeService.highEarningEmployees();
                    break;
                case 4:
                case 5:
                case 6:
                    EmployeeService.sortEmployees(choice);
                    break;
                case 7:
                    EmployeeService.getEmployeNames();
                    break;
                case 8:
                    EmployeeService.totalSalary();
                    break;
                case 9:
                    EmployeeService.averageSalary();
                    break;
                case 10:
                    EmployeeService.maxSalEmp();
                    break;
                case 11:
                    EmployeeService.minSalEmp();
                    break;
                case 12:
                    EmployeeService.groupByDept();
                    break;
                case 13:
                    EmployeeService.countByDept();
                    break;
                case 14:
                    EmployeeService.averageByDept();
                    break;
                case 15:
                    System.out.print("Enter Employee ID: ");
                    if (scanner.hasNextInt()) {
                        int id = scanner.nextInt();
                        EmployeeService.findById(id);
                    } else {
                        System.out.println("Invalid ID format. Must be an integer.");
                    }
                    scanner.nextLine(); 
                    break;
                case 16:
                    System.out.println("Exiting Employee Analytics Console. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please select a choice from 1 to 16.");
            }
        }
        
        scanner.close();
    }
	
}

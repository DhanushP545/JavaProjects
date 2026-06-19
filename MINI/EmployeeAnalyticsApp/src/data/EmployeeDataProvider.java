//this is an AI generated data supply
package data;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDataProvider {
	public static Map<Integer,Employee> init() {
		Map<Integer, Employee> database = new HashMap<>();
		String[] names = {
	            "Alice Smith", "Bob Jones", "Charlie Brown", "Diana Prince", "Evan Wright",
	            "Fiona Gallagher", "George Clark", "Hannah Abbott", "Ian Malcolm", "Julia Roberts",
	            "Kevin Bacon", "Laura Croft", "Michael Scott", "Natalie Portman", "Oliver Twist"
	        };
		String[] departments = {"HR", "Engineering", "Marketing", "Sales", "Finance"};
		for (int i = 0; i < 15; i++) {
            int id = 10001 + i; 
            String name = i%2==0?names[i]:names[15-i-1];
            String department = departments[i % departments.length]; 
            double salary = 55000.0 + (int)(Math.random()*40000.0); 
            int age = 25 + i; 
            String email = name.toLowerCase().replace(" ", ".") + "@company.com";
            Employee emp = new Employee(id, name, department, salary, age, email);
            database.put(id, emp);
		}
		
		return database;
	}
}

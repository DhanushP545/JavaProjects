# Employee Analytics Console Application

## Overview

Employee Analytics Console Application is a Java 8 console-based project developed to practice Functional Programming concepts introduced in Java 8.

The project demonstrates the use of:

* Lambda Expressions
* Functional Programming
* Method References
* Stream API
* Optional
* Predicate-based filtering
* Stream analytics operations

The application manages employee records in memory and generates various analytical reports using Java Streams.

---

## Features

### Employee Management

* Display all employee records
* Search employees by department
* Search employee by ID

### Stream-Based Analytics

* Display high salary employees
* Sort employees by salary (Ascending)
* Sort employees by salary (Descending)
* Sort employees alphabetically
* Display employee names only
* Calculate total salary expenditure
* Calculate average salary
* Find highest paid employee
* Find lowest paid employee

### Department Analytics

* Group employees by department
* Count employees per department
* Calculate average salary per department

### Java 8 Concepts Demonstrated

* Lambda Expressions
* Method References
* Stream API
* filter()
* map()
* reduce()
* sorted()
* collect()
* groupingBy()
* counting()
* averagingDouble()
* Optional

---

## Project Structure

```text
src
│
├── data
│   ├── Employee.java
│   └── EmployeeDataProvider.java
│
├── service
│   ├── EmployeeService.java
│   └── Main.java
```

---

## Technologies Used

* Java 8+
* Collections Framework
* Stream API
* Functional Programming Concepts

---

## Menu Options

```text
1. Display All Employees
2. Search Employees By Department
3. Show High Salary Employees
4. Sort By Salary (Ascending)
5. Sort By Salary (Descending)
6. Sort By Name
7. Display Employee Names Only
8. Total Salary Expenditure
9. Average Salary
10. Highest Paid Employee
11. Lowest Paid Employee
12. Group Employees By Department
13. Employee Count Per Department
14. Average Salary Per Department
15. Find Employee By ID
16. Exit
```

---

## Learning Objectives

This project was built to strengthen understanding of:

* Functional Interfaces
* Lambda Expressions
* Stream Processing
* Optional
* Collection Manipulation
* Data Analytics using Streams
* Clean Java Programming Practices

---

## Sample Analytics Performed

### Salary Analytics

* Total payroll expenditure
* Average employee salary
* Highest salary employee
* Lowest salary employee

### Department Analytics

* Department-wise grouping
* Employee count per department
* Department-wise average salary

---

## Future Enhancements

* Add custom Functional Interface implementation
* Add Supplier-based employee generation
* Export reports to files
* Add JDBC database integration
* Add Spring Boot REST API layer
* Add persistent storage

---

## Learning Outcome

Building this project helped me understand 
* Java 8 Features
* Functional Programming
* Stream API


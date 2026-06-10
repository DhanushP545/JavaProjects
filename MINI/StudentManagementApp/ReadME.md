# Student Management Console Application

## Overview

A console-based Java application for managing student records. The project demonstrates fundamental Object-Oriented Programming concepts including encapsulation, inheritance, polymorphism, constructor overloading, method overriding, static members, and access modifiers.

## Features

* Add a new student
* View student details by ID
* Update student department
* Display total student count
* Prevent duplicate student IDs
* In-memory storage using HashMap

## Technologies Used

* Java
* OOP Concepts
* Collections (HashMap)
* Console I/O (Scanner)

## Project Structure

```text
Main.java
Person.java
Student.java
```

### Person

Base class containing:

* Name
* Age
* Getters and setters
* displayDetails()

### Student

Derived from Person.

Additional fields:

* Student ID
* Department
* Static student count

Overrides:

* displayDetails()

### Main

Contains:

* Menu system
* Student management operations
* In-memory database

## OOP Concepts Demonstrated

### Encapsulation

Private fields with controlled access through getters and setters.

### Inheritance

Student inherits from Person.

### Polymorphism

```java
Person p = db.get(id);
p.displayDetails();
```

### Constructor Overloading

Multiple Student constructors with different parameter lists.

### Method Overriding

Student overrides displayDetails() from Person.

### Static Members

Used to track total number of students created.

## How to Run

Compile:

```bash
javac Main.java Person.java Student.java
```

Run:

```bash
java Main
```

## Sample Menu

```text
1. Add Student
2. View Student
3. Update Department
4. Show Student Count
5. Exit
```

## Learning Outcome

This project was built as part of Week 1 of a Java Backend learning roadmap to strengthen core Java and OOP fundamentals before moving to exception handling, collections, and Spring Boot.

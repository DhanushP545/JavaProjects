# ATM Simulation System

## Overview

A console-based Java application that simulates basic ATM operations. The project focuses on Exception Handling, Interfaces, Abstract Classes, Collections, and Object-Oriented Programming concepts while managing bank accounts in memory.

## Features

* Create a new bank account
* View account details
* Deposit money
* Withdraw money
* Transfer funds between accounts
* Check account balance
* Display total accounts
* Handle invalid operations using custom exceptions
* In-memory storage using HashMap

## Technologies Used

* Java
* OOP Concepts
* Exception Handling
* Custom Exceptions
* Interfaces
* Abstract Classes
* Collections (HashMap)
* Console I/O (Scanner)

## Project Structure

```text
Main.java

ATMOperations.java
ATMService.java
BankAccount.java
SavingsAccount.java

AccountNotFoundException.java
InsufficientBalanceException.java
InvalidAmountException.java
```

### ATMOperations

Interface containing ATM operations:

* deposit()
* withdraw()
* checkBalance()

### BankAccount

Abstract parent class containing:

* Account Number
* Account Holder Name
* Balance
* Constructors
* Getters and Setters

### SavingsAccount

Concrete implementation of a bank account.

Implements:

* ATMOperations

Provides:

* Deposit functionality
* Withdrawal functionality
* Balance checking

### ATMService

Handles all business operations:

* Account creation
* Account lookup
* Deposits
* Withdrawals
* Fund transfers
* Balance inquiries
* Account management

Uses:

```java
HashMap<Integer, SavingsAccount>
```

as an in-memory database.

### Custom Exceptions

#### AccountNotFoundException

Thrown when an account number does not exist.

#### InsufficientBalanceException

Thrown when a withdrawal or transfer exceeds available balance.

#### InvalidAmountException

Thrown when the entered amount is invalid.

### Main

Contains:

* Menu-driven console interface
* User input handling
* Exception handling
* Application flow control

## Concepts Demonstrated

### Encapsulation

Private fields with controlled access through getters and setters.

### Inheritance

```java
SavingsAccount extends BankAccount
```

### Abstraction

```java
abstract class BankAccount
```

### Interface Implementation

```java
implements ATMOperations
```

### Polymorphism

```java
BankAccount account = accounts.get(accountNumber);
```

### Collections

```java
HashMap<Integer, SavingsAccount>
```

used for account storage.

### Exception Handling

Demonstrates:

* try-catch
* throw
* throws
* Custom Exceptions
* Exception Propagation

## How to Run

Compile:

```bash
javac */*.java
```

Run:

```bash
java bank.Main
```

## Sample Menu

```text
===== ATM SIMULATION SYSTEM =====

1. Create Account
2. View Account
3. Deposit Money
4. Withdraw Money
5. Transfer Funds
6. Check Balance
7. Show Total Accounts
8. Exit
```

## Sample Output Screenshots

Project screenshots are available in:

```text
output-screenshots/
```

These screenshots demonstrate:

* Account Creation
* Deposit Operations
* Withdraw Operations
* Fund Transfer
* Balance Check
* Exception Handling Scenarios

## Learning Outcome

This project was built as part of Week 2 of a Java Backend learning roadmap to strengthen understanding of Exception Handling, Custom Exceptions, Interfaces, Abstract Classes, Collections, and clean OOP design before moving to Java 8 Features and Functional Programming.

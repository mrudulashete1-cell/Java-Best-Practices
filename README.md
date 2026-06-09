# Java Best Practices Demo

## Project Description

This project is a simple Java application that demonstrates the implementation of Java Best Practices. The program calculates an employee's annual salary based on their monthly salary while following clean coding standards, object-oriented programming principles, and proper coding conventions.

## Objectives

* Understand Java coding standards.
* Implement Encapsulation.
* Use Constants effectively.
* Perform Input Validation.
* Write clean, readable, and maintainable code.
* Follow Object-Oriented Programming (OOP) principles.

## Features

* Employee information management.
* Annual salary calculation.
* Validation of employee name and salary.
* Use of constants instead of hard-coded values.
* Proper documentation using Javadoc comments.
* Clean and organized code structure.

## Technologies Used

* Java
* Object-Oriented Programming (OOP)

## Project Structure

```
JavaBestPracticesDemo/
│
├── EmployeeSalaryCalculator.java
└── README.md
```

## Program Explanation

### Employee Class

The Employee class demonstrates encapsulation by keeping its data members private and providing public getter and setter methods.

Attributes:

* name
* monthlySalary

Validation:

* Name cannot be empty.
* Salary cannot be negative.

### EmployeeSalaryCalculator Class

This class contains:

* The main method
* Annual salary calculation method
* Constant MONTHS_IN_YEAR

### Formula Used

Annual Salary = Monthly Salary × 12

## How to Compile and Run

### Compile

```bash
javac EmployeeSalaryCalculator.java
```

### Run

```bash
java EmployeeSalaryCalculator
```

## Sample Output

```
Employee Name : John Doe
Monthly Salary: ₹25000.0
Annual Salary : ₹300000.0
```

## Java Best Practices Demonstrated

1. Encapsulation
2. Use of Constants (`static final`)
3. Input Validation
4. Meaningful Naming Conventions
5. Code Documentation using Javadoc
6. Separation of Responsibilities
7. Readable and Maintainable Code

## Learning Outcomes

After completing this project, you will understand:

* Java class design
* Encapsulation
* Validation techniques
* Use of constants
* Java coding standards
* Clean code principles

## Author

Mrudula Shete

## License

This project is created for educational and learning purposes only.

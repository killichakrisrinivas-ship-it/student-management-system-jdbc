# Student Management System (JDBC + PostgreSQL)

## Overview

This is a console-based Student Management System developed in Java using JDBC and PostgreSQL. The project demonstrates CRUD (Create, Read, Update, Delete) operations while following the DAO (Data Access Object) design pattern.

The primary goal of this project was to learn how Java applications interact with relational databases without using frameworks like Hibernate or Spring.

---

## Features

* Add a student
* View all students
* Update student details
* Delete a student
* Input validation for user data
* Exception handling using try-with-resources
* PreparedStatement to prevent SQL injection

---

## Technologies Used

* Java
* JDBC
* PostgreSQL
* Maven
* IntelliJ IDEA
* Git & GitHub

---

## Project Structure

```
src
 ├── Main.java
 ├── Student.java
 ├── StudentDAO.java
 ├── StudentDAOImpl.java
 ├── StudentManagementSystem.java
 └── DBConnection.java
```

---

## Database

Table: `Student`

Columns:

* sid
* name
* age
* branch
* email

---

## Concepts Practiced

* Object-Oriented Programming
* Interfaces
* DAO Pattern
* JDBC
* PreparedStatement
* ResultSet
* Exception Handling
* Input Validation
* Maven Project Structure

---

## Future Improvements

* Search student by ID
* Search by name
* Pagination
* Logging
* Unit Testing
* Hibernate
* Spring Boot REST API

---

## Author

Chakri Srinivaskilli


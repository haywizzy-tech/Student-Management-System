Student Management System (CLI)

📌 Overview

The Student Management System is a Command-Line Interface (CLI) application built using Java and MySQL.
It allows users to manage students and courses, including adding records and viewing stored data.

This project demonstrates:

- Java backend development
- Database integration using JDBC
- Clean architecture (DAO pattern)
- Basic CRUD operations

---

🚀 Features

- ➕ Add new students
- 📚 Add new courses
- 👀 View all students
- 📖 View all courses
- 💾 Persistent data storage using MySQL

---

🏗️ Project Structure

src/
 ├── Main.java
 ├── model/
 │    ├── Student.java
 │    └── Course.java
 ├── dao/
 │    ├── StudentDAO.java
 │    └── CourseDAO.java
 ├── db/
 │    └── DBConnection.java

---

⚙️ Technologies Used

- Java (JDK 17+)
- MySQL
- JDBC (Java Database Connectivity)
- IntelliJ IDEA

---

🗄️ Database Setup

Step 1: Create Database

CREATE DATABASE school_db;
USE school_db;

Step 2: Create Tables

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE courses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100)
);

---

🔌 Configuration

Update your database credentials in:

"DBConnection.java"

private static final String URL = "jdbc:mysql://localhost:3306/school_db";
private static final String USER = "root";
private static final String PASSWORD = "";

---

▶️ How to Run the Project

1. Open project in IntelliJ IDEA
2. Ensure MySQL server is running
3. Run "Main.java"
4. Use the menu displayed in the terminal

---

🧪 Sample Menu

1. Add Student
2. Add Course
3. View Students
4. View Courses
5. Exit

---

🔁 Git Setup (Optional)

git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/yourusername/your-repo.git
git push -u origin main

---

📈 Future Improvements

- Enroll students in courses
- Update and delete records
- Search functionality
- GUI (JavaFX or Web-based interface)
- REST API version (Spring Boot)

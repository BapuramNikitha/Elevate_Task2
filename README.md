# Elevate_Task2

Student Record Management System (Java)
This is a simple console-based Java program that allows users to manage student records using an ArrayList.
It supports the following operations: Add, View, Update, and Delete students.
Features
 1. Add Student
 2. User enters ID, Name, and Marks.
 3. A Student object is created and added to an ArrayList.
View Students
 1.Displays all student records stored in the ArrayList.
 2.Shows the details in the format:
Update Student
 1.User enters a Student ID to update.
 2.If found, program asks for new Name and Marks, then updates the record.
 3.If not found, shows a message:
Delete Student
 1.User enters a Student ID to delete.
 2.The program searches through the ArrayList and removes the student manually using index-based removal (not removeIf).
 3.Displays a success or failure message.
Exit
 1.Ends the program safely.
ArrayList for Storage
  ArrayList<Student> is used to dynamically store multiple student objects.
Menu-driven Approach
  while loop keeps showing the menu until the user selects Exit (5).
  Uses Scanner for user input.

--- Student Management Menu ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Alice
Enter Student Marks: 92.5
Student data added successfully!

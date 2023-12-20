package com.eif.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.eif.data.Student;

public class StudentService {

	// Initialize a list of students with two initial students
	private List<Student> st1 = new ArrayList<>(
			Arrays.asList(
					new Student("John", 1, 20, "Computer Science", "123 Main St"),
					new Student("Alice", 2, 22, "Mathematics", "456 Elm St")));

	// Method to get the list of students
	public List<Student> getStudentList() {
		return st1;
	}

	// Method to get a student by name
	public Student getStudent_byName(String studentName) {
		Student st;
		// Use stream and filter to find the student by name (case insensitive)
		st = st1.stream().filter(s -> s.getStudentname().equalsIgnoreCase(studentName)).findFirst().get();
		return st;
	}

	// Method to get a student by ID
	public Student getStudent_ById(int studentId) {
		return st1.stream().filter(s -> s.getStudentid() == studentId).findFirst().get();
	}

	// Method to add a new student to the list
	public void addStudent(Student student) {
		st1.add(student);
	}

	// Method to update an existing student or add a new one if not found
	public void updateStudent(Student student) {
		for (int i = 0; i < st1.size(); i++) {
			if (st1.get(i).getStudentid() == student.getStudentid()) {
				// Update the existing student in the list
				st1.set(i, student);
				return;
			}
		}
		// Add the new student to the list if not found
		st1.add(student);
		return;
	}
}
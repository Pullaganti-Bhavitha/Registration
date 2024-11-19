package com.student.management.services;

import java.util.List;

import com.student.management.entities.Registration;

public interface StudentService {
	String addStudent(Registration st);
	Registration searchStudent(int id);
	String updateStudent(Registration st);
	String deleteStudent(int id);
	
	List<Registration> fetchAllStudents();
	String deleteAllStudents();
}

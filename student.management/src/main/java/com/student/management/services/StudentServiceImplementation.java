package com.student.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entities.Registration;
import com.student.management.repositories.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	StudentRepository repo;
	
	public String addStudent(Registration st) {
		
		repo.save(st);
		return "Student added";
	}
	
	public Registration searchStudent(int id) {
		Registration st=repo.findById(id).get();
		return st;
	}
	
	public String updateStudent(Registration st) {
		repo.save(st);
		return "Student updated";
	}
	
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "Student deleted";
	}

	public List<Registration> fetchAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public String deleteAllStudents() {
		repo.deleteAll();
		return "Deleted";
	}
}

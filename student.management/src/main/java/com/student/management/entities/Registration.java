package com.student.management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registration {
	
	@Id
	int id;
	String name;
	String email;
	String dob;
	String branch;
	int yop;
	double cgpa;
	
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(int id, String name, String email, String dob, String branch, int yop, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.branch = branch;
		this.yop = yop;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", branch="
				+ branch + ", yop=" + yop + ", cgpa=" + cgpa + "]";
	}
	
	
	
	
	
}

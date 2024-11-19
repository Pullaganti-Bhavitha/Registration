package com.student.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.management.entities.Registration;

public interface StudentRepository extends JpaRepository<Registration, Integer>{

}

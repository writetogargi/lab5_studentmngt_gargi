package com.gargi.springboot.studentmanagement.service;

import com.gargi.springboot.studentmanagement.entity.Student;

import java.util.List;


public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);


}

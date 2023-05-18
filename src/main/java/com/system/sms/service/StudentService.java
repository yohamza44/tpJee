package com.system.sms.service;

import java.util.List;

import com.system.sms.entity.Student;

public interface StudentService {
	public List<Student> getAllStudents() ; 
	public Student saveStudent(Student s);
    Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}

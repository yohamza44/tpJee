package com.system.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.sms.entity.Student;
import com.system.sms.repository.StudentRepository;
@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRepository ;
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}
	
	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}


}

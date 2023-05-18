package com.system.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.system.sms.entity.Student;
import com.system.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository ;
	@Override
	public void run(String... args) throws Exception {
		
		/*studentRepository.save(new Student("hamza", "mak", "hamza02@gmail.com"));
		studentRepository.save(new Student("azerty", "mak", "hamza0235@gmail.com"));
		studentRepository.save(new Student("yahya", "mak", "hamza0254a@gmail.com"));*/
		
	}

}

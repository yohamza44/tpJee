package com.system.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.sms.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

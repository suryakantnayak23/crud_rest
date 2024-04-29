package com.org.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.dto.Student;

public interface StudentRespository extends JpaRepository<Student, Integer> {
//first generic data is of key type and second one the data type of primary key
	List<Student> findByEmailAndPassword(String email, String password);
                                                                               
	List<Student> findByCourse(String course);

}

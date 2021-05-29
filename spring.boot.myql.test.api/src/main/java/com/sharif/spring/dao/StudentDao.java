package com.sharif.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sharif.spring.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

	
}

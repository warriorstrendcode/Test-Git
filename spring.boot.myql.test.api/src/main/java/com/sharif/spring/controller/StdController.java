package com.sharif.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharif.spring.dao.StudentDao;
import com.sharif.spring.model.Student;

@RestController
@RequestMapping("/student")
public class StdController {
	@Autowired
	private StudentDao stDao;
	
	@PostMapping("/newStds")
	public String newstd(@RequestBody List<Student> students) {
		stDao.saveAll(students);
		return "Student Admitted : " +students.size();
	}
	@GetMapping("/exstds")
	public List<Student> exstds(){
		return (List<Student>) stDao.findAll();
	}
}

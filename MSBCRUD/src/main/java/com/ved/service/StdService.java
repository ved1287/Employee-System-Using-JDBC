package com.ved.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ved.bean.Student;
import com.ved.dao.studentDAO;

public class StdService {
	@Autowired
	   studentDAO dao;
	public Student addStudent(Student student) {
		
		return this.dao.save(student);
	}
	public Student updateStudent(Student student) {
	
		return this.dao.save(student);
	}
	public boolean deleteStudent(int id) {
		this.dao.deleteById(id);
		return true;
		
	}
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return this.dao.findAll();
	}
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> pd=dao.findById(id);
		if(pd.isPresent()) {
			pd.get();
		}
		return null;
		
		
	}
	

}

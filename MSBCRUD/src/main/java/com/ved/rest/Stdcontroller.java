package com.ved.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ved.bean.Student;
import com.ved.service.StdService;

@RestController
public class Stdcontroller {
	@Autowired
	StdService service;
	@PostMapping("/addStudent")
	public Student f1(@RequestBody Student student) {
		return this.service.addStudent(student);
	}
	@PutMapping("/updateStudent")
	public Student f2(@RequestBody Student student) {
		return this.service.updateStudent(student);
	}
	@DeleteMapping("/deleteById/{id}")
	public boolean f3(@PathVariable("id")int id) {
		 return this.service.deleteStudent(id);
		 
	}
	@GetMapping("/getAllStudent")
	public List<Student>f4(){
		return this.service.getAllStudent();
	}
	@GetMapping("/studentById/{id}")
	public Student f5(@PathVariable("id")int id) {
		return this.service.getStudentById(id);
	}
	

}

package com.spring.springNativeQuery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.spring.springNativeQuery.Entity.Student;
import com.spring.springNativeQuery.Service.StudentService;
import com.spring.springNativeQuery.error.StudentNotFoundException;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/addStudent")
	public Student saveDetails(@RequestBody Student student)  
	{
		return studentService.saveDetails(student);
		
	}
	
	@GetMapping("/customfetch")
	public List<Student> fetchController()
	{
		return studentService.fetchAll();
	}
	
	@GetMapping("/students/{id}")
	public Student fetchStudentById(@PathVariable("id")int id) throws StudentNotFoundException {
		return studentService.fetchStudentById(id);
}
}

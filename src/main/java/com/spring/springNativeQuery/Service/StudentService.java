package com.spring.springNativeQuery.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springNativeQuery.Entity.Student;
import com.spring.springNativeQuery.Repository.StudentRepo;
import com.spring.springNativeQuery.error.StudentNotFoundException;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveDetails(Student student)  {
		return studentRepo.save(student);
	}
	
	
	
	
	public List<Student> fetchAll()
	{
		return studentRepo.fetchAllFromCustom();
	}

	public Student fetchStudentById(int id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		Optional<Student> student =
				studentRepo.findById(id);
		
		if(!student.isPresent()) {
			throw new StudentNotFoundException("student record not available");
		}
		return student.get();
	}
}

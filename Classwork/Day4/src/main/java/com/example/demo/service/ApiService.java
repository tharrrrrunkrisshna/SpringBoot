package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class ApiService {
	 
	@Autowired
	StudentRepo sr;
	
	public Student saveinfo(Student s)
	{
		return sr.save(s);
	}
	public List<Student> showinfo()
	{
		return sr.findAll();
	}
	public Student changeinfo(Student s)
	{
		return sr.saveAndFlush(s);
	}
	public void deleteinfo(Student s)
	{
		sr.delete(s);
	}
}

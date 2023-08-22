package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService sser;
	
	@PostMapping("addstudent")
	public Student add(@RequestBody Student s)
	{
		return sser.saveinfo(s);
	}
	
	@PutMapping("update")
	public Student update(@RequestBody Student s)
	{
		return sser.changeinfo(s);
	}
	
	@DeleteMapping("deletedetails")
	public String del(@RequestBody Student s)
	{
		sser.deleteinfo(s);
		return "Record Deleted";
	}
}

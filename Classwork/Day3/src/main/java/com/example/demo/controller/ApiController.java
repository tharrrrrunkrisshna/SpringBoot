package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.services.Apiservice;

@RestController
public class ApiController {
	@Autowired
	Apiservice eser;
	
	@PostMapping("addemployee")
	public Employee add(@RequestBody Employee es)
	{
		return eser.saveinfo(es);
	}
	@GetMapping("showdetails")
	public List<Employee> show()
	{
		return eser.showinfo();
	}
}

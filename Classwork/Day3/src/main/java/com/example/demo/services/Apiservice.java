package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepo;

@Service
public class Apiservice {
	
	@Autowired
	EmployeeRepo er;
	
	public Employee saveinfo(Employee es)
	{
		return er.save(es);
	}
	
	public List<Employee> showinfo()
	{
		return er.findAll();
	}
}

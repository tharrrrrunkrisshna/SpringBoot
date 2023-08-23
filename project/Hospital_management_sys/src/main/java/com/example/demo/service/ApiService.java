package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Doctor;
import com.example.demo.repository.Repositories;

@Service
public class ApiService {
	
	@Autowired
	Repositories res;
	public Doctor saveinfo(Doctor d)
	{
		return res.save(d);
	}
	public List<Doctor> showinfo()
	{
		return res.findAll();
	}
	public Doctor changeinfo(Doctor d)
	{
		return res.saveAndFlush(d);
	}
	public void deleteinfo(Doctor d)
	{
		res.delete(d);
	}
 	
 	public Optional<Doctor> getid(int id)
 	{
 		return res.findById(id);
 	}
 	
 	public void deleteid(int id)
 	{
 		res.deleteById(id);
 	}
 	
 	public String updateInfobyId(int id,Doctor ss)
 	{
 		res.saveAndFlush(ss);
 		if(res.existsById(id))
 		{
 			return "Updated";
 		}
 		else
 		{
 			return "Enter Valid Id";
 		}
 	}
}

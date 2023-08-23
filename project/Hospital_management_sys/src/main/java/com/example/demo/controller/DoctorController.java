package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Doctor;
import com.example.demo.service.ApiService;

@RestController
public class DoctorController {
	
	@Autowired
	ApiService aser;
	@PostMapping("adddoctor")
	public Doctor add(@RequestBody Doctor d)
	{
		return aser.saveinfo(d);
	}
	@GetMapping("showdocdetails")
	public List<Doctor> show()
	{
		return aser.showinfo();
	}
	@PutMapping("update")
	public Doctor update(@RequestBody Doctor d)
	{
		return aser.changeinfo(d);
	}
	@DeleteMapping("deletedetails")
	public String delete(@RequestBody Doctor d)
	{
		aser.deleteinfo(d);
		return "Record Deleted";
	}
	@GetMapping("ShowByID/{id}")
    public  Optional<Doctor>  getmyid(@PathVariable int id)
    {
    	return aser.getid(id);
    }
    
    @DeleteMapping("delid/{id}")
    public  void deletemyid(@PathVariable int id)
    {
    	aser.deleteid(id);
    }
    
    @PutMapping("UpdateById/{id}")
    public String modifybyId(@PathVariable int id,@RequestBody Doctor d)
    {
    	return aser.updateInfobyId(id,d);
    }

}

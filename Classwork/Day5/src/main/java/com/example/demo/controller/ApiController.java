package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService bser;
	
	@PostMapping("addbook")
	public Book add(@RequestBody Book b)
	{
		return bser.saveinfo(b);
	}
	@GetMapping("showdetails")
	public List<Book> show()
	{
		return bser.showinfo();
	}
	@PutMapping("update")
	public Book modify(@RequestBody Book b)
	{
		return bser.changeinfo(b);
	}
	@DeleteMapping("delete")
	public String del(Book b)
	{
		bser.deleteinfo(b);
		return "Record deleted";
	}
}

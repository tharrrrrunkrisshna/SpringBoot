package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repository.BookRepo;

@Service
public class ApiService {
	@Autowired
	BookRepo br;
	
	public Book saveinfo (Book b)
	{
		return br.save(b);
	}
	public List<Book> showinfo()
	{
		return br.findAll();
	}
	public Book changeinfo(Book b)
	{
		return br.saveAndFlush(b);
	}
	public void deleteinfo(Book b)
	{
		br.delete(b);
	}
}

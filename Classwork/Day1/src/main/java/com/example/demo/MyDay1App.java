package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyDay1App {
	@GetMapping("disp")
	public String display()
	{
		return "Welcome";
	}
}

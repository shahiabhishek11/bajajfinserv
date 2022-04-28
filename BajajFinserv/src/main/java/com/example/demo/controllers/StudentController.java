package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentServices;

@RestController
public class StudentController 
{
	@Autowired
	StudentServices service;
	
	@PostMapping("/bfhl")
	public List<Student> showComapny()
	{
		return service.getAll();
	}
	
	
}

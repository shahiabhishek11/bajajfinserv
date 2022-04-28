package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repositories.StudentRepository;



@Service
public class StudentServices {
	
	@Autowired
	StudentRepository srepo;
	
	
	public List<Student> getAll()
	{
		return srepo.findAll();
	}
}

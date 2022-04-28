package com.example.demo.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	int id;
	
	
	
	boolean is_success=true;
	
	
	String user_id="john_doe_17091999";
	
	
	String email="john@xyz.com";
	
	
	String roll_number="ABCD123";
	
	
	
	int numbers[]= {1,334,4};
	
	
	char alphabets[]= {'A','R'};

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(boolean is_success, String user_id, String email, String roll_number, int[] numbers,
			char[] alphabets) {
		super();
		this.is_success = is_success;
		this.user_id = user_id;
		this.email = email;
		this.roll_number = roll_number;
		this.numbers = numbers;
		this.alphabets = alphabets;
	}

	public boolean isIs_success() {
		return is_success;
	}

	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public char[] getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(char[] alphabets) {
		this.alphabets = alphabets;
	}

	@Override
	public String toString() {
		return "Student [is_success=" + is_success + ", user_id=" + user_id + ", email=" + email + ", roll_number="
				+ roll_number + ", numbers=" + Arrays.toString(numbers) + ", alphabets=" + Arrays.toString(alphabets)
				+ "]";
	}
	
	
	

}

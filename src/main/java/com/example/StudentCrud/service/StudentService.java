package com.example.StudentCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.StudentCrud.domain.student;
import com.example.StudentCrud.domain.student2;
import com.example.StudentCrud.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public List<student > listAll()
	{
	   		return repo.findAll();
	}
	public void save(student std)
	{
		repo.save(std);
	
	}
	public student get(long id)
	{
		return repo.findById(id).get();
	}
	public void delete(long id)
	{
		repo.deleteById(id);
	}

}

package com.example.StudentCrud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class student {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID",nullable=false)
    private Long ID;
    private String Course;
    private int Fee;
    
	
	public student() {
		super(); 
		// TODO Auto-generated constructor stub
	}

	public student(Long id,  String Course, int Fee) {
		this.ID = id;
		this.Course = Course;
		this.Fee = Fee;
		}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}

	
	
    
}

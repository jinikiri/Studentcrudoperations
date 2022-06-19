package com.example.StudentCrud.domain;

public class student2 {
	 private String Course;
	 private int Fee;
		public student2(String course, int fee) {
			super();
			this.Course = course;
			this.Fee = fee;
		}
		public String getCourse() {
			return Course;
		}
		public void setCourse(String course) {
			this.Course = course;
		}
		public int getFee() {
			return Fee;
		}
		public void setFee(int fee) {
			this.Fee = fee;
		}
	    

}

package com.telusko.MappingRelations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
//	@ManyToOne
//	private Student student;
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	@ManyToMany
	private List<Student> students = new ArrayList<Student>();
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lnameString) {
		this.lname = lnameString;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lnameString=" + lname + "]";
	}
	
}

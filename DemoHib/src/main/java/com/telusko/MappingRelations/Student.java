package com.telusko.MappingRelations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
//	@OneToOne
//	private Laptop laptop;
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
//	@OneToMany(mappedBy = "student")
	@ManyToMany(mappedBy = "students")
	private List<Laptop> laptop=new ArrayList<Laptop>();
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", laptop=" + laptop + ", marks=" + marks + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private int marks;
}

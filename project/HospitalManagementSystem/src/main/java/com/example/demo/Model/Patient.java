package com.example.demo.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="PatientDetails")
public class Patient {
	@Column(name="Hospital")
	private String hname;
	@Id@Column(name="PatientID")
	private int id;
	@Column(name="PatientName")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Gender")
	private String gender;
	@Column(name="SugarLevel")
	private String Sugar;
	@Column(name="BloodPressure")
	private String Bp;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String hname, int id, String name, int age, String gender, String sugar, String bp) {
		super();
		this.hname = hname;
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		Sugar = sugar;
		Bp = bp;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSugar() {
		return Sugar;
	}
	public void setSugar(String sugar) {
		Sugar = sugar;
	}
	public String getBp() {
		return Bp;
	}
	public void setBp(String bp) {
		Bp = bp;
	}
	
	
	

	
}

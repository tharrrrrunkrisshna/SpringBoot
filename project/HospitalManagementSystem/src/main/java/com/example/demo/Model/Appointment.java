package com.example.demo.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Appointment {
	@Id
	private int apId;
	private String status;
	private String date;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_PatientID")
	private Patient pa;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int apId, String status, String date, Patient pa) {
		super();
		this.apId = apId;
		this.status = status;
		this.date = date;
		this.pa = pa;
	}

	public int getApId() {
		return apId;
	}

	public void setApId(int apId) {
		this.apId = apId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Patient getPa() {
		return pa;
	}

	public void setPa(Patient pa) {
		this.pa = pa;
	}

		
	
}

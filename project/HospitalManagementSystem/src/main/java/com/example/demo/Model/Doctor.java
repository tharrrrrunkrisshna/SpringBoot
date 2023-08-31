package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name="DoctorDetails")
public class Doctor {
	@Id
	@Column(name="DoctorID")
	private int docid;
	@Column(name="DoctorFirstName")
	private String docfname;
	@Column(name="MedicalSpecialties")
	private String spl;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_docid")
	 private List<Appointment> ap;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int docid, String docfname, String spl, List<Appointment> ap) {
		super();
		this.docid = docid;
		this.docfname = docfname;
		this.spl = spl;
		this.ap = ap;
	}
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public String getDocfname() {
		return docfname;
	}
	public void setDocfname(String docfname) {
		this.docfname = docfname;
	}
	public String getSpl() {
		return spl;
	}
	public void setSpl(String spl) {
		this.spl = spl;
	}
	public List<Appointment> getAp() {
		return ap;
	}
	public void setAp(List<Appointment> ap) {
		this.ap = ap;
	}
		
}

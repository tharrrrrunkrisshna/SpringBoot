package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PatientRepo;
import com.example.demo.Model.Doctor;


@Service
public class PatientService {

	@Autowired
	PatientRepo sr;
	public Doctor saveinfo(Doctor ss)
	{
		return sr.save(ss);
	}
	
	public List<Doctor> showinfo()
	{
		return sr.findAll();
	}
	
	public Doctor changeinfo(Doctor ss) 
	{
		return sr.saveAndFlush(ss);
	}
	
	public void deleteinfo(Doctor ss)
	  {
		sr.delete(ss);
	  }
	 
	public Optional<Doctor> getid(int id)
	  {
		  return sr.findById(id);
	  }
	 
	public void deleteid(int id)
	  {
		  sr.deleteById(id);
	  }
	 
	public String updateInfobyId(int id,Doctor ss)
	  {
		  sr.saveAndFlush(ss);
		  if(sr.existsById(id))
		  {
			  return "Updated";
		  }
		  else
		  {
			  return "Enter Valid PatientId";
		  }
	  }
	public Doctor savePatientdetails(Doctor ss)
	  {
		  return sr.save(ss);
	  }
	public List<Doctor> showpatientinfo()
	  {
		  return sr.findAll();
	  }
	public List<Doctor> sortinfo(String s)
	  {
		  return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	  }

	public List<Doctor> getbypage(int pgno,int pgsize)
	  {
	      Page<Doctor> p = sr.findAll(PageRequest.of(pgno, pgsize));
	      return p.getContent();
	  }
	  public List<Doctor> getDoctor()
	    {
	    	return sr.getDoctorinfo();
	    }

	    public List<Doctor> getSortDoctor()
	    {
	    	return sr.getSortedDocinfo();
	    }

	 public void deleappo (int id)
	 {
		 sr.deletemebyid(id);
	 }
	 
	    
}


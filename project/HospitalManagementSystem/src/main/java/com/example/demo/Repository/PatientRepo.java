package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Doctor;

import jakarta.transaction.Transactional;

@Repository

public interface PatientRepo extends JpaRepository<Doctor, Integer>{

	@Query(value = "select * from doctor_details",nativeQuery = true)



	public List<Doctor> getDoctorinfo();

	

	@Query(value="select * from doctor_details order by DoctorID desc",nativeQuery=true)

	public List<Doctor> getSortedDocinfo();


	@Transactional
	@Modifying
	@Query(value="delete from doctor_details where DoctorID=:para ",nativeQuery=true)
	public void deletemebyid(@Param ("para")int id);
}
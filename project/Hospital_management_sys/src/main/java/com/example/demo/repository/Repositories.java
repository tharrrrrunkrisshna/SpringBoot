package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.models.Doctor;

public interface Repositories extends JpaRepository<Doctor, Integer>{

}

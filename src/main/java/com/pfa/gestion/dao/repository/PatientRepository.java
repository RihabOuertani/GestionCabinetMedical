package com.pfa.gestion.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


public interface PatientRepository extends JpaRepository<Patient, Long> {



}

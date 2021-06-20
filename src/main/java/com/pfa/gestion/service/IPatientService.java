package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Patient;

@Service
public interface IPatientService {

    List<Patient> getAllPatients();

    Patient add(Patient patient);
    boolean update(Patient patient);
    boolean deleteById(Long id);
    Patient findById(Long id);

}

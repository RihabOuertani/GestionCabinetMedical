package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Patient;

public interface IPatientDao {

    List<Patient> getAllPatients();

    Patient addPatient(Patient patient);

    boolean updatePatient(Patient patient);

    boolean deletePatient(Long id);

    Optional<Patient> findById(Long id);


}

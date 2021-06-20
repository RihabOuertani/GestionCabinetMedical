package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IPatientDao;

import com.pfa.gestion.dao.entity.Patient;
import com.pfa.gestion.service.IPatientService;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private IPatientDao patientDao;

    @Override
    public List<Patient> getAllPatients() {
        return patientDao.getAllPatients();
    }

    @Override
    public Patient add(Patient patient) {
        return patientDao.addPatient(patient);
    }

    @Override
    public boolean update(Patient patient) {
        return patientDao.updatePatient(patient);
    }

    @Override
    public boolean deleteById(Long id) {
        return patientDao.deletePatient(id);
    }

    @Override
    public Patient findById(Long id) {
        Optional<Patient> patientOptional=patientDao.findById(id);
        return patientOptional.orElseThrow(()-> new EntityNotFoundException("patient not found" +id));
    }

}

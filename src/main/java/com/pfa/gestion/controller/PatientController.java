package com.pfa.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pfa.gestion.dao.entity.Patient;
import com.pfa.gestion.service.IPatientService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private IPatientService patientService;

    @GetMapping("/")
    @ResponseBody
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("/find")
    public Patient getPatient(@RequestParam Long id) {
        return patientService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.add(patient);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deletePatient(@RequestParam Long id) {
        return patientService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updatePatient(@RequestBody Patient patient) {
        return patientService.update(patient);
    }
}

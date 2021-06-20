package com.pfa.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pfa.gestion.dao.entity.Consultation;
import com.pfa.gestion.service.IConsultationService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/consultation")
public class ConsultationController {

    @Autowired
    private IConsultationService consultationService;

    @GetMapping("/")
    @ResponseBody
    public List<Consultation> getConsultations(){
        return consultationService.getAllConsultations();
    }

    @GetMapping("/find")
    public Consultation getConsultation(@RequestParam Long id) {
        return consultationService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Consultation addConsultation(@RequestBody Consultation consultation) {
        return consultationService.add(consultation);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteConsultation(@RequestParam Long id) {
        return consultationService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateConsultation(@RequestBody Consultation consultation) {
        return consultationService.update(consultation);
    }
}

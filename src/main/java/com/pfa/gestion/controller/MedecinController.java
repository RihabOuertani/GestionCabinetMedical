package com.pfa.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pfa.gestion.dao.entity.Medecin;

import com.pfa.gestion.service.IMedecinService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/medecin")
public class MedecinController {

    @Autowired
    private IMedecinService medecinService;

    @GetMapping("/")
    @ResponseBody
    public List<Medecin> getMedecins(){
        return medecinService.getAllMedecins();
    }

    @GetMapping("/find")
    public Medecin getMedecin(@RequestParam Long id){
        return medecinService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Medecin addPatient(@RequestBody Medecin medecin) {
        return medecinService.add(medecin);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteMedecin(@RequestParam Long id) {
        return medecinService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateMedecin(@RequestBody Medecin medecin) {
        return medecinService.update(medecin);
    }


}

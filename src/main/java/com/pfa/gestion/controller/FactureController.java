package com.pfa.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.pfa.gestion.dao.entity.Facture;

import com.pfa.gestion.service.IFactureService;

@RestController
@RequestMapping("/facture")
public class FactureController {

    @Autowired
    private IFactureService factureService;

    @GetMapping("/")
    @ResponseBody
    public List<Facture> getFactures(){
        return factureService.getAllFactures();
    }

    @GetMapping("/find")
    public Facture getFacture(@RequestParam Long id) {
        return factureService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Facture addFacture(@RequestBody Facture facture) {
        return factureService.add(facture);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteFacture(@RequestParam Long id) {
        return factureService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateFacture(@RequestBody Facture facture) {
        return factureService.update(facture);
    }

}

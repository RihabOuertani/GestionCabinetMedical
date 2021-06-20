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

import com.pfa.gestion.dao.entity.Ordonnance;
import com.pfa.gestion.service.IOrdonnanceService;

@RestController
@RequestMapping("/ordonnance")
public class OrdonnanceController {

    @Autowired
    private IOrdonnanceService ordonnanceService;

    @GetMapping("/")
    @ResponseBody
    public List<Ordonnance> getOrdonnances(){
        return ordonnanceService.getAllOrdonnances();
    }

    @GetMapping("/find")
    public Ordonnance getOrdonnance(@RequestParam Long id) {
        return ordonnanceService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Ordonnance addOrdonnance(@RequestBody Ordonnance ordonnance) {
        return ordonnanceService.add(ordonnance);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteOrdonnance(@RequestParam Long id) {
        return ordonnanceService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateOrdonnance(@RequestBody Ordonnance ordonnance) {
        return ordonnanceService.update(ordonnance);
    }

}

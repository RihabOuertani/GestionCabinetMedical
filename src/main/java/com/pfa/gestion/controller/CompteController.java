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

import com.pfa.gestion.dao.entity.Compte;

import com.pfa.gestion.service.ICompteService;


@RestController
@RequestMapping("/compte")
public class CompteController {

    @Autowired
    private ICompteService compteService;

    @GetMapping("/")
    @ResponseBody
    public List<Compte> getComptes(){
        return compteService.getAllComptes();
    }

    @GetMapping("/find")
    public Compte getCompte(@RequestParam Long id) {
        return compteService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Compte addCompte(@RequestBody Compte compte) {
        return compteService.add(compte);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteCompte(@RequestParam Long id) {
        return compteService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateCompte(@RequestBody Compte compte) {
        return compteService.update(compte);
    }
}

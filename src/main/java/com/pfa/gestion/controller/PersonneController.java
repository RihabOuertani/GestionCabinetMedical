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

import com.pfa.gestion.dao.entity.Personne;
import com.pfa.gestion.service.IPersonneService;

@RestController
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    private IPersonneService personneService;

    @GetMapping("/")
    @ResponseBody
    public List<Personne> getPersonnes(){
        return personneService.getAllPersonnes();
    }

    @GetMapping("/find")
    public Personne getPersonne(@RequestParam Long id) {
        return personneService.finById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public void  addPersonne(@RequestBody Personne personne) {
        personneService.add(personne);

    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deletePersonne(@RequestParam Long id) {
        return personneService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updatePersonne(@RequestBody Personne personne) {
        return personneService.update(personne);
    }
}

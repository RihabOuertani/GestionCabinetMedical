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

import com.pfa.gestion.dao.entity.Secretaire;
import com.pfa.gestion.service.ISecretaireService;

@RestController
@RequestMapping("/secretaire")
public class SecretaireController {

    @Autowired
    private ISecretaireService secretaireService;

    @GetMapping("/")
    @ResponseBody
    public List<Secretaire> getSecretaires(){
        return secretaireService.getAllSecretaires();
    }

    @GetMapping("/find")
    public Secretaire getSecretaire(@RequestParam Long id) {
        return secretaireService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Secretaire addSecretaire(@RequestBody Secretaire secretaire) {
        return secretaireService.add(secretaire);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteSecretaire(@RequestParam Long id) {
        return secretaireService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateSecretaire(@RequestBody Secretaire secretaire) {
        return secretaireService.update(secretaire);
    }

}

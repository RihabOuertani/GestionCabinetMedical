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

import com.pfa.gestion.dao.entity.Dossier;
import com.pfa.gestion.service.IDossierService;

@RestController
@RequestMapping("/dossier")
public class DossierController {

    @Autowired
    private IDossierService dossierService;

    @GetMapping("/")
    @ResponseBody
    public List<Dossier> getDossiers(){
        return dossierService.getAllDossiers();
    }

    @GetMapping("/find")
    public Dossier getDossier(@RequestParam Long id) {
        return dossierService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public void  addDossier(@RequestBody Dossier dossier) {
        dossierService.add(dossier);

    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteDossier(@RequestParam Long id) {
        return dossierService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateDossier(@RequestBody Dossier dossier) {
        return dossierService.update(dossier);
    }


}

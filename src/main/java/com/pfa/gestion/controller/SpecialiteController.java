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

import com.pfa.gestion.dao.entity.Specialite;
import com.pfa.gestion.service.ISpecialiteService;
@RestController
@RequestMapping("/specialite")
public class SpecialiteController {

    @Autowired
    private ISpecialiteService specialiteService;

    @GetMapping("/")
    @ResponseBody
    public List<Specialite> getSpecialites(){
        return specialiteService.getAllSpecialites();
    }

    @GetMapping("/find")
    public Specialite getSpecialite(@RequestParam Long id){
        return specialiteService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Specialite addSpecialite(@RequestBody Specialite specialite) {
        return specialiteService.add(specialite);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteSpecialite(@RequestParam Long id) {
        return specialiteService.deleteById(id);
    }

    @PutMapping("/update")
    public boolean updateSpecialite(@RequestBody Specialite specialite) {
        return specialiteService.update(specialite);
    }

}

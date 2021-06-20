package com.pfa.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pfa.gestion.dao.entity.RDV;
import com.pfa.gestion.service.IRDVService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/RDV")
public class RDVController {

    @Autowired
    private IRDVService rdvService;

    @GetMapping("/")
    @ResponseBody
    public List<RDV> getRdvs(){
        return rdvService.getAlRdvs();
    }

    @GetMapping("/find")
    public RDV getRdv(@RequestParam Long id) {
        return rdvService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public RDV addRdv(@RequestBody RDV rdv) {
        return rdvService.add(rdv);
    }
    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteRdv(@RequestParam Long id) {
        return rdvService.deleteById(id);
    }
    @PutMapping("/update")
    public boolean updateRdv(@RequestBody RDV rdv) {
        return rdvService.update(rdv);
    }
}

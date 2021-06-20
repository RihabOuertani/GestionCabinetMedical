package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Medecin;



@Service
public interface IMedecinService {

    List<Medecin> getAllMedecins();

    Medecin add(Medecin medecin);
    boolean update(Medecin medecin);
    boolean deleteById(Long id);
    Medecin findById(Long id);

}

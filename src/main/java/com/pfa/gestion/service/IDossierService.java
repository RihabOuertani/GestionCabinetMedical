package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Dossier;

@Service
public interface IDossierService {

    List<Dossier> getAllDossiers();
    Dossier add(Dossier dossier);
    boolean update(Dossier dossier);
    boolean deleteById(Long id);
    Dossier findById(Long id);
}

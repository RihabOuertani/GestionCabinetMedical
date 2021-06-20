package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Dossier;

public interface IDossierDao {
    List<Dossier> getAllDossiers();
    Dossier addDossier(Dossier dossier);
    boolean updateDossier(Dossier dossier);
    boolean deleteDossier(Long id);
    Optional<Dossier> findById(Long id);


}

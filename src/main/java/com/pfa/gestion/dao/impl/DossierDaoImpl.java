package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.IDossierDao;
import com.pfa.gestion.dao.entity.Dossier;
import com.pfa.gestion.dao.repository.DossierRepository;

@Repository
public class DossierDaoImpl implements IDossierDao {

    @Autowired
    private DossierRepository dossierRepository;

    @Override
    public List<Dossier> getAllDossiers() {
        return dossierRepository.findAll();
    }

    @Override
    public Dossier addDossier(Dossier dossier) {
        return dossierRepository.save(dossier);
    }

    @Override
    public boolean updateDossier(Dossier dossier) {
        if (dossierRepository.save(dossier) != null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteDossier(Long id) {
        if (dossierRepository.existsById(id)) {
            dossierRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Dossier> findById(Long id) {
        return dossierRepository.findById(id);
    }

}

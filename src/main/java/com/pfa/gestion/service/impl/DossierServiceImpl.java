package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IDossierDao;
import com.pfa.gestion.dao.entity.Dossier;
import com.pfa.gestion.service.IDossierService;

@Service
public class DossierServiceImpl implements IDossierService {

    @Autowired
    private IDossierDao dossierDao;
    @Override
    public List<Dossier> getAllDossiers() {
        return dossierDao.getAllDossiers();
    }

    @Override
    public Dossier add(Dossier dossier) {
        return dossierDao.addDossier(dossier);
    }

    @Override
    public boolean update(Dossier dossier) {
        return dossierDao.updateDossier(dossier);
    }

    @Override
    public boolean deleteById(Long id) {
        return dossierDao.deleteDossier(id);
    }

    @Override
    public Dossier findById(Long id) {
        Optional<Dossier> dossierOptional = dossierDao.findById(id);
        return dossierOptional.orElseThrow(() -> new EntityNotFoundException("Dossier not found" + id));
    }

}

package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IMedecinDao;
import com.pfa.gestion.dao.entity.Medecin;
import com.pfa.gestion.service.IMedecinService;

@Service
public class MedecinServiceImpl implements IMedecinService {

    @Autowired
    private IMedecinDao medecinDao;

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinDao.getAllMedecins();
    }

    @Override
    public Medecin add(Medecin medecin) {
        return medecinDao.addMedecin(medecin);
    }

    @Override
    public boolean update(Medecin medecin) {
        return medecinDao.UpdateMedecin(medecin);
    }

    @Override
    public boolean deleteById(Long id) {
        return medecinDao.deleteMedecin(id);
    }

    @Override
    public Medecin findById(Long id) {
        Optional<Medecin> medecinOptional=medecinDao.findById(id);
        return medecinOptional.orElseThrow(()-> new EntityNotFoundException("medecin not found" +id));
    }

}

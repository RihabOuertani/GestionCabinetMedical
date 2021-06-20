package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.IMedecinDao;
import com.pfa.gestion.dao.entity.Medecin;
import com.pfa.gestion.dao.repository.MedecinRepository;

@Repository
public class MedecinDaoImpl implements IMedecinDao {

    @Autowired
    private MedecinRepository medecinRepository;

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }

    @Override
    public Medecin addMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }



    @Override
    public boolean deleteMedecin(Long id) {
        if ( medecinRepository.existsById(id)) {
            medecinRepository.deleteById(id);
            return true;
        } return false;
    }


    @Override
    public boolean UpdateMedecin(Medecin medecin) {
        if ( medecinRepository.save(medecin)!= null)
            return true;
        else
            return false;
    }

    @Override
    public Optional<Medecin> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }


}

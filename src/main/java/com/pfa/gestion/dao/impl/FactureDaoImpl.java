package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.IFactureDao;
import com.pfa.gestion.dao.entity.Facture;
import com.pfa.gestion.dao.repository.FactureRepository;

@Repository
public class FactureDaoImpl implements IFactureDao {

    @Autowired
    private FactureRepository factureRepository;

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture addFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public boolean updateFacture(Facture facture) {
        if(factureRepository.save(facture)!= null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteFacture(Long id) {
        if(factureRepository.existsById(id)) {
            factureRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Facture> findById(Long id) {
        return factureRepository.findById(id);
    }

}

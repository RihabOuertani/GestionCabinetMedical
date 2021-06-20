package com.pfa.gestion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IFactureDao;
import com.pfa.gestion.dao.entity.Facture;
import com.pfa.gestion.service.IFactureService;

@Service
public class FactureServiceImpl implements IFactureService {

    @Autowired
    private IFactureDao factureDao;

    @Override
    public List<Facture> getAllFactures() {
        return factureDao.getAllFactures();
    }

    @Override
    public Facture add(Facture facture) {
        return factureDao.addFacture(facture);
    }

    @Override
    public boolean update(Facture facture) {
        return factureDao.updateFacture(facture);
    }

    @Override
    public boolean deleteById(Long id) {
        return factureDao.deleteFacture(id);
    }

    @Override
    public Facture findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}

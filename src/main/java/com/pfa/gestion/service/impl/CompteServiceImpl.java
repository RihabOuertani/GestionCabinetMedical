package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.ICompteDao;
import com.pfa.gestion.dao.entity.Compte;
import com.pfa.gestion.service.ICompteService;

@Service
public class CompteServiceImpl implements ICompteService {

    @Autowired
    private ICompteDao compteDao;

    @Override
    public List<Compte> getAllComptes() {
        return compteDao.getAllComptes();
    }

    @Override
    public Compte add(Compte compte) {
        return compteDao.addCompte(compte);
    }

    @Override
    public boolean update(Compte compte) {
        return compteDao.updateCompte(compte);
    }

    @Override
    public boolean deleteById(Long id) {
        return compteDao.deleteCompte(id);
    }

    @Override
    public Compte findById(Long id) {
        Optional<Compte> compteOptional = compteDao.findById(id);
        return compteOptional.orElseThrow(()-> new EntityNotFoundException("compte not found with:" + id));
    }

}

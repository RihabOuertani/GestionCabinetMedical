package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.ICompteDao;
import com.pfa.gestion.dao.entity.Compte;
import com.pfa.gestion.dao.repository.CompteRepository;

@Repository
public class CompteDaoImpl implements ICompteDao {

    @Autowired
    private CompteRepository compteRepository;

    @Override
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }

    @Override
    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public boolean updateCompte(Compte compte) {
        if (compteRepository.save(compte)!=null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteCompte(Long id) {
        if(compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Compte> findById(Long id) {
        return compteRepository.findById(id);
    }

}

package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.ISecretaireDao;
import com.pfa.gestion.dao.entity.Secretaire;
import com.pfa.gestion.service.ISecretaireService;

@Service
public class SecretaireServiceImpl implements ISecretaireService {


    @Autowired
    private ISecretaireDao secretaireDao;

    @Override
    public List<Secretaire> getAllSecretaires() {
        return secretaireDao.getAllSecretaires();	}

    @Override
    public Secretaire add(Secretaire secretaire) {
        return secretaireDao.addSecretaire(secretaire);
    }

    @Override
    public boolean update(Secretaire secretaire) {
        return secretaireDao.updateSecretaire(secretaire);
    }

    @Override
    public boolean deleteById(Long id) {
        return secretaireDao.deleteSecretaire(id);
    }

    @Override
    public Secretaire findById(Long id) {
        Optional<Secretaire> secretaireOptional = secretaireDao.findById(id);
        return secretaireOptional.orElseThrow(()-> new EntityNotFoundException("secretaire not found :" + id));
    }

}

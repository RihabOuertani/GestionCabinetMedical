package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.ISecretaireDao;
import com.pfa.gestion.dao.entity.Secretaire;
import com.pfa.gestion.dao.repository.SecretaireRepository;

@Repository
public class SecretaireDaoImpl implements ISecretaireDao {

    @Autowired
    private SecretaireRepository secretaireRepository;

    @Override
    public List<Secretaire> getAllSecretaires() {
        return secretaireRepository.findAll();
    }

    @Override
    public Secretaire addSecretaire(Secretaire secretaire) {
        return secretaireRepository.save(secretaire);
    }

    @Override
    public boolean updateSecretaire(Secretaire secretaire) {
        if (secretaireRepository.save(secretaire) != null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteSecretaire(Long id) {
        if (secretaireRepository.existsById(id)) {
            secretaireRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Secretaire> findById(Long id) {
        return secretaireRepository.findById(id);
    }

}

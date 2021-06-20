package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Secretaire;

public interface ISecretaireDao {

    List<Secretaire> getAllSecretaires();

    Secretaire addSecretaire(Secretaire secretaire);
    boolean updateSecretaire(Secretaire secretaire);
    boolean deleteSecretaire(Long id);

    Optional<Secretaire> findById(Long id);


}

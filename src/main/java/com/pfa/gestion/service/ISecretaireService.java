package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Secretaire;

@Service
public interface ISecretaireService {

    List<Secretaire> getAllSecretaires();

    Secretaire add(Secretaire secretaire);

    boolean update(Secretaire secretaire);

    boolean deleteById(Long id);
    Secretaire findById(Long id);

}
